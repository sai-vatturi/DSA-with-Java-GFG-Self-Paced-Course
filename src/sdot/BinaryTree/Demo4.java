import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Node {
	int data;

	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class Tree {
	Node root;

	void insertLevelOrder(String[] input) {

		if (input.length == 1) 
			return;

		root = new Node(Integer.parseInt(input[0]));

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		int n = input.length;
		int index = 1;

		while(index < n && !q.isEmpty()) {
			Node cur = q.remove();

			if (!input[index].equals("N")) {
				cur.left = new Node(Integer.parseInt(input[index]));
				q.add(cur.left);
			}
			index++;

			if (index >= n) 
				break;

			if (!input[index].equals("N")) {
				cur.right = new Node(Integer.parseInt(input[index]));
				q.add(cur.right);
			}
			index++;
		}
	}

	void displayInOrder() {
		inOrder(root);
		System.out.println();

	}

	void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	void displayPostOrder() {
		postOrder(root);
		System.out.println();
	}

	void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	void displayPreOrder() {
		preOrder(root);
		System.out.println();

	}

	void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void displayLevelOrder() {
		levelOrder(root);
	}

	void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {
			int nextLevel = q.size();

			for (int i = 0; i < nextLevel; i++) {
				Node cur = q.remove();

				System.out.print(cur.data + " ");

				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}
			}
			System.out.println();
		}
	}

	void rightSideView() {
		ArrayList<Integer> list = new ArrayList<>();
		rightSideViewUtil(root, 0, list);
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	void rightSideViewUtil(Node node, int level, ArrayList<Integer> list) {
		if (node == null)
			return;
		if (level == list.size())
			list.add(node.data);
		rightSideViewUtil(node.right, level+1, list);
		rightSideViewUtil(node.left, level+1, list);
	}

}

public class Demo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split("\\s");

		Tree t = new Tree();
		t.insertLevelOrder(s);

		System.out.println("In order traversal: ");
		t.displayInOrder();

		System.out.println("Pre order traversal: ");
		t.displayPreOrder();

		System.out.println("Post order traversal: ");
		t.displayPostOrder();

		System.out.println("Level order traversal: ");
		t.displayLevelOrder();

		System.out.println("Right View of Binary Tree: ");
		t.rightSideView();
	}
}