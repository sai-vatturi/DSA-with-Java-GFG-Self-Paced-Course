//import org.w3c.dom.Node;
//
//import java.util.Scanner;
//
//class ListNode<T> {
//    T data;
//    Node<T> left;
//    Node<T> right;
//
//    ListNode(T data) {
//        this.data = data;
//        left = right = null;
//    }
//}
//
//class BSTT<T> {
//    Node<T> root;
//
//    BSTT() {
//        this.root = null;
//    }
//
//    void insert(T data) {
//        root = insertRec(root, data);
//    }
//
//    Node<T> insertRec(Node<T> root, T data) {
//        if (root == null) {
//            root = new Node<>(data);
//            return root;
//        }
//
//        @SuppressWarnings("unchecked")
//        Comparable<T> comparableData = (Comparable<T>) data;
//
//        if (comparableData.compareTo(root.data) < 0)
//            root.left = insertRec(root.left, data);
//        else if (comparableData.compareTo(root.data) > 0)
//            root.right = insertRec(root.right, data);
//
//        return root;
//    }
//
//    void displayPreOrder() {
//        System.out.print("Preorder traversal: ");
//        preOrder(root);
//    }
//
//    void preOrder(Node<T> root) {
//        if (root == null)
//            return;
//
//        System.out.print(root.data + " "); // root
//        preOrder(root.left); // left
//        preOrder(root.right); // right
//    }
//
//    // Add this method to the BST class
//    boolean search(T value) {
//        return searchRec(root, value);
//    }
//
//    boolean searchRec(Node<T> root, T value) {
//        if (root == null)
//            return false;
//
//        @SuppressWarnings("unchecked")
//        Comparable<T> comparableValue = (Comparable<T>) value;
//
//        if (comparableValue.compareTo(root.data) == 0)
//            return true;
//        else if (comparableValue.compareTo(root.data) < 0)
//            return searchRec(root.left, value);
//        else
//            return searchRec(root.right, value);
//    }
//}
//
//public class GenericBST {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String type = scanner.nextLine().trim().toLowerCase();
//
//        switch (type) {
//            case "int":
//                BST<Integer> intTree = new BST<>();
//                takeInputAndInsert(intTree, scanner);
//                intTree.displayPreOrder();
//                System.out.println("\nGet the value to search");
//                takeInputAndSearch(intTree, scanner);
//
//                break;
//            case "character":
//                BST<Character> charTree = new BST<>();
//                takeInputAndInsert(charTree, scanner);
//                charTree.displayPreOrder();
//                System.out.println("\nGet the value to search");
//                takeInputAndSearch(charTree, scanner);
//                break;
//            case "double":
//                BST<Double> doubleTree = new BST<>();
//                takeInputAndInsert(doubleTree, scanner);
//                doubleTree.displayPreOrder();
//                System.out.println("\nGet the value to search");
//                takeInputAndSearch(doubleTree, scanner);
//                break;
//            default:
//                System.out.println("Invalid type");
//        }
//
//        scanner.close();
//    }
//
//    private static <T> void takeInputAndSearch(BST<T> tree, Scanner scanner) {
//        T value = null;
//        String input = scanner.next();
//        value = parseInput(input);
//        boolean exists = tree.search(value);
//        System.out.println("Is search element present: " + exists);
//    }
//
//
//    private static <T> void takeInputAndInsert(BST<T> tree, Scanner scanner) {
//        while (true) {
//            T data = null;
//            String input = scanner.next();
//            if (input.equals("0")) {
//                break;
//            }
//            if (tree.root == null) {
//                data = parseInput(input);
//                tree.root = new Node<>(data);
//            } else {
//                data = parseInput(input);
//                tree.insert(data);
//            }
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    private static <T> T parseInput(String input) throws NumberFormatException {
//        if (input.matches("\\d+")) {
//            return (T) Integer.valueOf(input);
//        } else if (input.matches("[a-zA-Z]")) {
//            return (T) Character.valueOf(input.charAt(0));
//        } else if (input.matches("\\d+\\.\\d+")) {
//            return (T) Double.valueOf(input);
//        } else {
//            throw new NumberFormatException();
//        }
//    }
//
//}
