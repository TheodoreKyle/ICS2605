class BinarySearchTreeNode {
    int data;
    BinarySearchTreeNode left;
    BinarySearchTreeNode right;

    BinarySearchTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree2 {
    BinarySearchTreeNode root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private BinarySearchTreeNode insertRec(BinarySearchTreeNode node, int data) {
        if (node == null) {
            return new BinarySearchTreeNode(data);
        }
        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }
        return node;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        // Inserting
        tree.insert(13);
        tree.insert(7);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(14);
        tree.insert(19);
        tree.insert(18);

        // Testing
        System.out.println("Root: " + tree.root.data);
        System.out.println("Root - Left: " + tree.root.left.data);
        System.out.println("Root - Right: " + tree.root.right.data);
        System.out.println("4th Level: " + tree.root.right.right.left.data);
    }
}