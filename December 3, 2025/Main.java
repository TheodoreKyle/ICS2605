class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static int countHeight(TreeNode root, int key) {
        TreeNode current = root; 
        int height = 0;
        while (current != null) {
            if (key == current.data) {
                return height;
            } else if (key < current.data) {
                current = current.left; 
                height++; 
            } else {
                current = current.right; 
                height++; 
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node8 = new TreeNode(8);
        TreeNode node12 = new TreeNode(12);
        TreeNode node17 = new TreeNode(17);
        TreeNode node25 = new TreeNode(25);
        TreeNode node18 = new TreeNode(18);

        root.left = node10;
        root.right = node20;
        
        node10.left = node8;
        node10.right = node12;

        node20.left = node17;
        node20.right = node25;

        node17.right = node18;
        int key = root.right.left.right.data;

        // Printing Nodes
        System.out.println("1st Level: " + root.data);
        System.out.println("2nd Level: " + root.left.data + "   " + root.right.data);
        System.out.println("3rd Level: " + root.left.left.data + "   " + root.left.right.data + "   " 
        + root.right.left.data + "   " + root.right.right.data);
        System.out.println("4th Level: " + root.right.left.right.data);

        System.out.println("\nHeight of 18: " + countHeight(root, key));
    }
}