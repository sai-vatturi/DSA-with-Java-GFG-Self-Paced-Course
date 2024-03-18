import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Node {
	int data;

	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BST {
	Node root;

	Node findLCA(Node node, int n1, int n2) {
		if (node.data == n1 || node.data ==n2 ) {
			return node;
		} 

		node leftLCA = findLCA(node.left, n1, n2);
		node rightLCA = findLCA(node.right, n1, n2)

		if (leftLCA != null && rightLCA != null) {
			return node;
		}

		return (leftLCA != null) ? leftLCA : rightLCA;
	}

	void levelOrderInsert(String[] input) {
		if (input.length == 0) {
			return;
		}

		root = new Node(Integer.parseInt(input[0]));
		Queue<Node> q = new LinkedList<>();

		q.add(root);
		int index = 1;

		while(i < n && !q.isEmpty) {
			Node cur = q.remove();
			if (!String[i].equals("N")) {
				cur.left = new Node(Integer.parseInt(String[i]));
			}
			i++;
			if (i >= n) {
				break;
			}
			if (!String[i].equals("N")) {
				cur.right = new Node(Integer.parseInt(String[i]));
			}
			i++;
		}
	}
}


public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String[] nodes = sc.nextLine().split("\\s");

		BST t = new BST():
		t.levelOrderInsert(nodes);
		Node res = t.findLCA(t.root, t.left, t.right, n1, n2);
		System.out.println(res.data);
	}
}