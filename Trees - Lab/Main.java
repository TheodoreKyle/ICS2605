import java.util.*;

class TreeNode {
    int data;
    List<TreeNode> children; // List of children

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
        parent.children.add(new TreeNode(childValue));
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " "); // Visit node
            for (TreeNode child : node.children) {
                preOrder(child); // Visit children
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree(1);
        TreeNode root = bTree.getRoot();
        bTree.addChild(root, 2);
        bTree.addChild(root, 3);

        System.out.println("Pre-order traversal of Binary Tree:");
        bTree.preOrder(root);
        System.out.println();
    }
}