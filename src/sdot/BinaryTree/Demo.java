	import java.util.Scanner;
	import java.util.LinkedList;
	import java.util.Queue;

	class Node {
		int data;

		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	class BinarySearchTree {
		Node root;

		void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

		void printLevelOrder() {
			levelOrder(this.root);
		}

		void levelOrder(Node root) {
			if (root == null) {
				return;
			}

			Queue<Node> q = new LinkedList<>();

			q.add(root);

			while (!q.isEmpty()) {
				int levelSize = q.size();

				for (int i = 0; i < levelSize; i++) {
					Node cur = q.remove();
					System.out.print(cur.data + " ");

					if (cur.left != null) {
						q.add(cur.left);
					}
					if (cur.right != null) {
						q.add(cur.right);
					}
				}
			}
			System.out.println();
		}


	}

	public class Demo {
		public static void main(String[] args) {
			BinarySearchTree t = new BinarySearchTree();

			t.insert(1);
			t.insert(2);
			t.insert(3);
			t.insert(4);

			t.printLevelOrder();
		}
	}

