package tree;

public class MaxDepth {
    static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        String[] elements = { "1", "2", "3", "4", "N", "N", "6", "7", "8", "N", "N", "9" };
        tree.levelOrderInsert(elements);

        System.out.println("\nHeight of the Tree");
        tree.printLevelOrderWithNulls();
        System.out.println(maxDepth(tree.root));
    }
}
