package tree;

public class MaxInBinaryTree {
    static int max = Integer.MIN_VALUE;

    static int findMax(Node root) {
        findMaxUtil(root);
        return max;

    }

    static void findMaxUtil(Node root) {
        if (root == null) {
            return;
        }
        if (root.data >= max) {
            max = root.data;
        }
        findMaxUtil(root.left);
        findMaxUtil(root.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(57);
        tree.root.left.left = new Node(29);
        tree.root.right.left = new Node(34);
        System.out.println(findMax(tree.root));
    }
}
