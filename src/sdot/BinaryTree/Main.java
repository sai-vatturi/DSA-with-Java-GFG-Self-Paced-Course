//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String type = scanner.nextLine().trim();
//        BinarySearchTree<Object> bst = new BinarySearchTree<>();
//
//        while (true) {
//            String input = scanner.next();
//            if (input.equals("0")) {
//                break;
//            }
//            switch (type) {
//                case "int":
//                    bst.insert(Integer.parseInt(input));
//                    break;
//                case "double":
//                    bst.insert(Double.parseDouble(input));
//                    break;
//                case "character":
//                    bst.insert(input.charAt(0));
//                    break;
//            }
//        }
//
//        System.out.print("Preorder traversal: ");
//        bst.preorderTraversal(bst.root);
//        System.out.println();
//
//        System.out.println("Get the value to search");
//        Object searchValue;
//        if (type.equals("int")) {
//            searchValue = scanner.nextInt();
//        } else if (type.equals("double")) {
//            searchValue = scanner.nextDouble();
//        } else {
//            searchValue = scanner.next().charAt(0);
//        }
//
//        Node foundNode = bst.search(searchValue);
//        if (foundNode != null) {
//            System.out.println("is search element present: true");
//        } else {
//            System.out.println("is search element present: false");
//        }
//    }
//}
//
//class BinarySearchTree<T extends Comparable<T>> {
//    Node root;
//
//    public void insert(T value) {
//        root = insertInternal(value, root);
//    }
//
//    private Node insertInternal(T value, Node parent) {
//        if (parent == null) {
//            return new Node(value);
//        }
//        int comp = value.compareTo(parent.data);
//        if (comp < 0) {
//            parent.left = insertInternal(value, parent.left);
//        } else if (comp > 0) {
//            parent.right = insertInternal(value, parent.right);
//        }
//        return parent;
//    }
//
//    public Node search(T target) {
//        return searchInternal(target, root);
//    }
//
//    private Node searchInternal(T target, Node node) {
//        if (node == null) {
//            return null;
//        }
//        int comp = target.compareTo(node.data);
//        if (comp < 0) {
//            return searchInternal(target, node.left);
//        } else if (comp > 0) {
//            return searchInternal(target, node.right);
//        }
//        return node;
//    }
//
//    void preorderTraversal(Node node) {
//        if (node != null) {
//            System.out.print(node.data + " ");
//            preorderTraversal(node.left);
//            preorderTraversal(node.right);
//        }
//    }
//
//    class Node {
//        T data;
//        Node left, right;
//
//        Node(T t) {
//            data = t;
//        }
//    }
//}
