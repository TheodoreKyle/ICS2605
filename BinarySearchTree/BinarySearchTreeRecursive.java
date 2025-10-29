class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
    }
}

class BinarySearchTreeRecursive {
    Node root;

    // 🔹 Iterative Insert (non-recursive)
    void insert(int value) {
        Node newNode = new Node(value);

        // If tree is empty, set root
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                // Duplicate value — do nothing (or handle differently)
                return;
            }
        }

        // Insert as left or right child
        if (value < parent.value) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // 🔹 Visual print (same as before)
    void printTree() {
        printRecursive(root, "", true);
    }

    private void printRecursive(Node node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.value);
        if (node.left != null || node.right != null) {
            if (node.right != null)
                printRecursive(node.right, prefix + (isTail ? "    " : "│   "), false);
            if (node.left != null)
                printRecursive(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    // Optional: simple search (iterative)
    boolean search(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value)
                return true;
            current = (value < current.value) ? current.left : current.right;
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTreeRecursive bst = new BinarySearchTreeRecursive();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Tree diagram:");
        bst.printTree();

        System.out.println("Search 40 → " + bst.search(40));
        System.out.println("Search 90 → " + bst.search(90));
    }  }