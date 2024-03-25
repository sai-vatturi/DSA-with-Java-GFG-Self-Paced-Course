package tree;

public class PrintAtKDistance {
    static void printAtK(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
        }
        printAtK(root.left, k - 1);
        printAtK(root.right, k - 1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(57);
        tree.root.left.left = new Node(29);
        tree.root.right.left = new Node(34);
        printAtK(tree.root, 2);
    }
}
