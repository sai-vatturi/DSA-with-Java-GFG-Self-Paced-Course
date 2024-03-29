//package tree;
//
//class Node {
//    int data;
//
//    Node left, right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class BinarySearchTree {
//    Node root;
//
//    void insert(int data) {
//        root = insertRec(root, data);
//    }
//
//    Node insertRec(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        }
//        if (data < root.data) {
//            root.left = insertRec(root.left, data);
//        }
//        if (data > root.data) {
//            root.right = insertRec(root.right, data);
//        }
//        return root;
//    }
//
//}
