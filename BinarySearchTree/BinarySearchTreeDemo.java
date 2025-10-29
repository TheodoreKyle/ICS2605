import java.util.*; 

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}
class BinarySearchTreeDemo {
    Node root;

    BinarySearchTreeDemo() {
        root = null;
    }

    void insert(int key) {
        Node newNode = new Node(key);
        // If tree is empty
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;
            if (key < current.key) { // go left
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else if (key > current.key) { // go right
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            } else {
                // Duplicate keys not allowed
                System.out.println("Duplicate key " + key + " ignored.");
                return;
            }
        }
    }


    boolean search(int key) {
        Node current = root;
    while (current != null) {
        if (key == current.key)
            return true;
        else if (key < current.key)
            current = current.left;
        else
            current = current.right;
    }
    return false; // not found
}
void inorder() {
    if (root == null) return;
    Stack<Node> stack = new Stack<>();
    Node current = root;
    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        System.out.print(current.key + " ");
        current = current.right;
    }
}
public static void main(String[] args) {
        BinarySearchTreeDemo bst = new BinarySearchTreeDemo();
        bst.insert(50);            
        bst.insert(30);           
        bst.insert(70);         
        bst.insert(20);        
        bst.insert(40);        
        bst.insert(60);
        bst.insert(80);
        System.out.print("Inorder Traversal: ");
        bst.inorder(); // Output: 20 30 40 50 60 70 80
        System.out.println();
        int keyToFind = 60;
        System.out.println("Search " + keyToFind + ": " + bst.search(keyToFind));
    }
}