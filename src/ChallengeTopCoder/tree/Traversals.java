package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Traversals {
    // static List<Integer> inorderTraversal(TreeNode root) {
    // if (root == null) {
    // return new ArrayList<Integer>();
    // }
    // List<Integer> result = new ArrayList<>();
    // Stack<TreeNode> st = new Stack<>();
    // TreeNode current = root;
    // while (current != null || !st.isEmpty()) {
    // while (current != null) {
    // st.push(current);
    // current = current.left;
    // }
    // current = st.pop();
    // result.add(current.data);
    // current = current.right;
    // }
    // return result;
    // }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(5);
        tree.root.right = new Node(8);

        System.out.println("Preorder Traversal");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nPostorder Traversal");
        tree.postOrderTraversal(tree.root);

        System.out.println("\nInorder Traversal");
        tree.inorderTraversal(tree.root);

        System.out.println("\nLevelorder Traversal");
        tree.levelOrderTraversal(tree.root);
    }
}
