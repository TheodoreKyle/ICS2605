class TreeNode {
    String data;
    TreeNode left;
    TreeNode right;
    
    // Constructor
    TreeNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null; 
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        // Creaing Nodes
        TreeNode root = new TreeNode("R");
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");
        TreeNode nodeF = new TreeNode("F");
        TreeNode nodeG = new TreeNode("G");
        
        // Connecting Nodes
        root.left = nodeA;
        root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        // Testing
        System.out.println("4th Level Node Data is: " + root.right.right.left.data); // Root: R, Right: B, Right(2): F, Left: G, Data to be printed out in line
        System.out.println("3rd Level Node Data is: " + root.right.left.data);
    }    
}