import java.util.*;

class TreeNode {
    int data;
    List<TreeNode> children;

    TreeNode(int value) {
        data = value;
        children = new ArrayList<>();
    }
}

class BinaryTree {
    private TreeNode root;

    public BinaryTree(int rootValue) {
        root = new TreeNode(rootValue);
    }

    public void addChild(TreeNode parent, int childValue) {
        TreeNode child = new TreeNode(childValue);
        parent.children.add(child);
    }

    public void preOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        for (TreeNode child : node.children) {
            preOrder(child);
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}

public class BinaryTreeLab {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        TreeNode root = tree.getRoot();
        tree.addChild(root, 2);
        tree.addChild(root, 3);
        System.out.println("Pre-order traversal of the Binary Tree:");
        tree.preOrder(root);
        System.out.println();
    }
}