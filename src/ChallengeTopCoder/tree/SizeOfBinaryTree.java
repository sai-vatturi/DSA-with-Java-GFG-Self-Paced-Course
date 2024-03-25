package tree;

public class SizeOfBinaryTree {

    static int findSize(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + findSize(root.left) + findSize(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(57);
        tree.root.left.left = new Node(29);
        tree.root.right.left = new Node(34);
        System.out.println(findSize(tree.root));
    }
}
