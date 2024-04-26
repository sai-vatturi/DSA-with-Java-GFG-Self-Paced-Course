package ChallengeTopCoder.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LevelOrderInsertion {
    private static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    private static class Tree {
        static Node root;
        Tree() {
            this.root = new Node(0);
        }
        static void levelOrderInsert(String[] nums) {
            root.data = Integer.parseInt(nums[0]);
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int i = 1;
            while (i < nums.length) {
                Node current = q.poll();
                if (!nums[i].equals("N")) {
                    current.left = new Node(Integer.parseInt(nums[i]));
                    q.add(current.left);
                }
                i++;
                if (i == nums.length) {
                    break;
                }
                if (!nums[i].equals("N")) {
                    current.right = new Node(Integer.parseInt(nums[i]));
                    q.add(current.right);
                }
                i++;
            }
        }
    }
    static void display(Node root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        String[] nums = {"1", "2", "3", "4", "5", "6", "7"};
        tree.levelOrderInsert(nums);
        display(tree.root);
    }
}
