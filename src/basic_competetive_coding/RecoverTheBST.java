package basic_competetive_coding;

public class RecoverTheBST {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BST {
        Node root;
        Node previousNode;
        Node firstSwappedNode;
        Node secondSwappedNode;

        BST() {
            this.root = null;
        }
        void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        void recoverTree(Node root) {
            inOrderFix(root);
            int temp = firstSwappedNode.data;
            firstSwappedNode.data = secondSwappedNode.data;
            secondSwappedNode.data = temp;
        }

        private void inOrderFix(Node root) {
            if (root == null) {
                return;
            }
            inOrderFix(root.left);
            if (previousNode != null && previousNode.data > root.data) {
                if (firstSwappedNode == null) {
                    firstSwappedNode = previousNode;
                }
                secondSwappedNode = root;
            }

            previousNode = root;
            inOrderFix(root.right);
        }
    }
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(4);
        tree.root.left = new Node(7);
        tree.root.right = new Node(9);
        tree.root.right.left = new Node(2);
        tree.inOrder(tree.root);
        tree.recoverTree(tree.root);
        tree.inOrder(tree.root);

    }
}
