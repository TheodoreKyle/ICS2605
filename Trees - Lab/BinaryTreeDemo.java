class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeDemo {
    Node root;

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    int totalnodes(Node node) {
        if (node == null)
            return 0;
        return 1 + totalnodes(node.left) + totalnodes(node.right);
    }

    int leafnodes(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        return leafnodes(node.left) + leafnodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeDemo tree = new BinaryTreeDemo();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder:");
        tree.postorder(tree.root);

        System.out.println("\n\nTotal Nodes of the Tree: " + tree.totalnodes(tree.root));
        System.out.println("\nLeaf Nodes in the Tree: " + tree.leafnodes(tree.root));
    }
}