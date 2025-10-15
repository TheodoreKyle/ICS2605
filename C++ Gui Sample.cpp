#include <windows.h>

// Function prototype
LRESULT CALLBACK WindowProcedure(HWND, UINT, WPARAM, LPARAM);

// Entry point
int WINAPI WinMain(HINSTANCE hInst, HINSTANCE hPrevInst, LPSTR args, int ncmdshow) {
    const char g_szClassName[] = "myWindowClass";
    WNDCLASSW wc = {0};

    wc.hbrBackground = (HBRUSH)COLOR_WINDOW;
    wc.hCursor = LoadCursor(NULL, IDC_ARROW);
    wc.hInstance = hInst;
    wc.lpszClassName = L"MyWindowClass";
    wc.lpfnWndProc = WindowProcedure;

    if (!RegisterClassW(&wc))
        return -1;

    CreateWindowW(L"MyWindowClass", L"Simple C++ GUI",
                  WS_OVERLAPPEDWINDOW | WS_VISIBLE,
                  100, 100, 400, 300, NULL, NULL, NULL, NULL);

    MSG msg = {0};

    while (GetMessage(&msg, NULL, 0, 0)) {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return 0;
}

// Window procedure handles messages (like button clicks)
LRESULT CALLBACK WindowProcedure(HWND hwnd, UINT msg, WPARAM wp, LPARAM lp) {
    static HWND hwndButton;

    switch (msg) {
    case WM_CREATE:
        hwndButton = CreateWindowW(L"Button", L"Click Me!",
                                   WS_VISIBLE | WS_CHILD,
                                   150, 100, 100, 30,
                                   hwnd, (HMENU)1, NULL, NULL);
        break;

    case WM_COMMAND:
        if (wp == 1) {
            MessageBoxW(hwnd, L"Button clicked!", L"Message", MB_OK | MB_ICONINFORMATION);
        }
        break;

    case WM_DESTROY:
        PostQuitMessage(0);
        break;

    default:
        return DefWindowProcW(hwnd, msg, wp, lp);
    }
    return 0;
}
