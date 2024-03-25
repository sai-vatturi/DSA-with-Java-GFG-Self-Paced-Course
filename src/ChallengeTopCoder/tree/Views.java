package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Views {
    static int maxLevel = 0;

    static void leftView(Node root) {
        leftViewUtil(root, 1);
    }

    static void leftViewUtil(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level > maxLevel) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        leftViewUtil(root.left, level + 1);
        leftViewUtil(root.right, level + 1);
    }

    static void rightView(Node root) {
        rightViewUtil(root, 1);
    }

    static void rightViewUtil(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level > maxLevel) {
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        rightViewUtil(root.right, level + 1);
        rightViewUtil(root.left, level + 1);
    }

    static void leftViewUsingQueue(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = q.remove();
                if (i == 0) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }

    static void rightViewUsingQueue(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = q.remove();
                if (i == levelSize - 1) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }

    // static void topViewUsingQueue(Node root) {
    // if (root == null) {
    // return;
    // }
    // Queue<Node> q = new LinkedList<>();
    // q.offer(root);
    // while (!q.isEmpty()) {
    // int levelSize = q.size();

    // for (int i = 0; i < levelSize; i++) {
    // Node current = q.remove();
    // if (i == 0) {
    // System.out.print(current.data + " ");
    // }
    // if (i == levelSize - 1) {
    // System.out.print(current.data + " ");
    // }
    // if (current.left != null) {
    // q.add(current.left);
    // }
    // if (current.right != null) {
    // q.add(current.right);
    // }
    // }
    // }
    // }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        String[] elements = { "1", "2", "3", "4", "N", "N", "6", "7", "8", "N", "N", "9" };
        tree.levelOrderInsert(elements);
        // leftView(tree.root);
        // leftViewUsingQueue(tree.root);
        rightView(tree.root);
        rightViewUsingQueue(tree.root);
    }
}
