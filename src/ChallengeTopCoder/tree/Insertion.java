package tree;

public class Insertion {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        String[] elements = { "1", "2", "3", "4", "N", "N", "6" };
        tree.levelOrderInsert(elements);
        tree.levelOrderTraversal(tree.root);
    }
}
