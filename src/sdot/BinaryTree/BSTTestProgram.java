import java.util.Scanner;

public class BSTTestProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter data type (int/double/character): ");
        String dataType = scanner.nextLine();

        System.out.print("Enter elements to insert into the binary search tree (enter 0 to stop, input may be in different lines or same lines): ");
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");

        BinarySearchTree<?> bst = new BinarySearchTree<>();

        for (String element : elements) {
            if (element.equals("0")) {
                break;
            }
            bst.insert(parseElement(dataType, element));
        }

        System.out.print("Preorder traversal: ");
        bst.preorderTraversal();
        System.out.println();

        System.out.print("Get the value to search: ");
        Object searchElement = parseElement(dataType, scanner.nextLine());

        System.out.println("is search element present: " + bst.search(searchElement));
    }

    private static Comparable<?> parseElement(String dataType, String element) {
        switch (dataType) {
            case "int":
                return Integer.parseInt(element);
            case "double":
                return Double.parseDouble(element);
            case "character":
                return element.charAt(0);
            default:
                throw new IllegalArgumentException("Invalid data type");
        }
    }

    static class BinarySearchTree<T extends Comparable<T>> {
        private Node<T> root;

        public void insert(T data) {
            this.root = insertRec(this.root, data);
        }

        private Node<T> insertRec(Node<T> root, T data) {
            if (root == null) {
                root = new Node<>(data);
                return root;
            }

            if (data.compareTo(root.data) < 0) {
                root.left = insertRec(root.left, data);
            } else if (data.compareTo(root.data) > 0) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        public void preorderTraversal() {
            preorderTraversalRec(root);
        }

        private void preorderTraversalRec(Node<T> root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversalRec(root.left);
                preorderTraversalRec(root.right);
            }
        }

        public boolean search(T data) {
            return searchRec(root, data);
        }

        private boolean searchRec(Node<T> root, T data) {
            if (root == null) {
                return false;
            }

            if (data.equals(root.data)) {
                return true;
            }

            if (data.compareTo(root.data) < 0) {
                return searchRec(root.left, data);
            } else {
                return searchRec(root.right, data);
            }
        }
    }

    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
}
