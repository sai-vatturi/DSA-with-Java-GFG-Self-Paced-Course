package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    void levelOrderInsert(String[] list) {
        if (list.length == 0) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        this.root = new Node(Integer.parseInt(list[0]));
        q.offer(this.root);

        int index = 1;
        while (!q.isEmpty()) {
            Node current = q.poll();

            if (index < list.length && !list[index].equals("N")) {
                current.left = new Node(Integer.parseInt(list[index]));
                q.offer(current.left);
            }
            index++;

            if (index < list.length && !list[index].equals("N")) {
                current.right = new Node(Integer.parseInt(list[index]));
                q.offer(current.right);
            }
            index++;
        }
    }

    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                q.offer(current.left);
            }
            if (current.right != null) {
                q.offer(current.right);
            }
        }
    }

    void printLevelOrderWithNulls() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            // Print all nodes of the current level
            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();
                System.out.print(current == null ? "null " : current.data + " ");

                if (current != null) {
                    q.offer(current.left); // Add null or actual left child
                    q.offer(current.right); // Add null or actual right child
                }
            }

            System.out.println(); // Move to the next line for the next level
        }
    }

}
