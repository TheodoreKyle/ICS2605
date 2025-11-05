class BinarySearchTreeNodeAct {
    int data;
    BinarySearchTreeNodeAct left;
    BinarySearchTreeNodeAct right;

    BinarySearchTreeNodeAct(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeAct {
    BinarySearchTreeNodeAct root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private BinarySearchTreeNodeAct insertRec(BinarySearchTreeNodeAct node, int data) {
        if (node == null) {
            return new BinarySearchTreeNodeAct(data);
        }
        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        }
        return node;
    }
}

public class BinarySearchTreeAct {
    public static void main(String[] args) {
        BinaryTreeAct tree = new BinaryTreeAct();
        BinaryTreeAct tree2 = new BinaryTreeAct();

        // Inserting - Tree #1
        tree.insert(5);
        tree.insert(2);
        tree.insert(10);
        tree.insert(7);
        tree.insert(15);
        tree.insert(6);
        tree.insert(8);
        tree.insert(12);
        tree.insert(20);
        tree.insert(30);

        // Inserting - Tree #2
        tree2.insert(8);
        tree2.insert(3);
        tree2.insert(10);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(14);
        tree2.insert(4);
        tree2.insert(7);
        tree2.insert(13);

        // Printing
        System.out.println("First Tree");
        System.out.println("Root: " + tree.root.data);
        System.out.println("2nd Level Root - Left: " + tree.root.left.data);
        System.out.println("2nd Level Root - Right: " + tree.root.right.data);
        System.out.println("3rd Level Root - Right - Left: " + tree.root.right.left.data);
        System.out.println("3rd Level Root - Right - Right: " + tree.root.right.right.data);
        System.out.println("4th Level Root - Right - Left - Left: " + tree.root.right.left.left.data);
        System.out.println("4th Level Root - Right - Left - Right: " + tree.root.right.left.right.data);
        System.out.println("4th Level Root - Right - Right - Left: " + tree.root.right.right.left.data);
        System.out.println("4th Level Root - Right - Right - Right: " + tree.root.right.right.right.data);
        System.out.println(
                "5th Level Root - Right - Right - Right - Right: " + tree.root.right.right.right.right.data + "\n");

        System.out.println("\nSecond Tree");
        System.out.println("Root: " + tree2.root.data);
        System.out.println("2nd Level Root - Left: " + tree2.root.left.data);
        System.out.println("2nd Level Root - Right: " + tree2.root.right.data);
        System.out.println("3rd Level Root - Left - Left: " + tree2.root.left.left.data);
        System.out.println("3rd Level Root - Left - Right: " + tree2.root.left.right.data);
        System.out.println("3rd Level Root - Right - Right: " + tree2.root.right.right.data);
        System.out.println("4th Level Root - Left - Right - Left: " + tree2.root.left.right.left.data);
        System.out.println("4th Level Root - Left - Right - Right: " + tree2.root.left.right.right.data);
        System.out.println("4th Level Root - Right - Right - Left: " + tree2.root.right.right.left.data);
    }
}