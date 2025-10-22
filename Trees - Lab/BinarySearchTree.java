class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}

class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode insertRec(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }
        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else {
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public BSTNode getRoot() {
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.println("In-order traversal of Binary Search Tree:");
        bst.inOrder(bst.getRoot());
        System.out.println();
    }
}
