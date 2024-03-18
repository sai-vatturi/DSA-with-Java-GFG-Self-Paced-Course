class Node {
	int data;

	Node left;
	Node right;

	Node(int data) {
		this.data = data;

		left = right = null;
	}
}

class BST {
	Node root;

	void insert(int data) {
		root = insertRec(root, data);
	}

	Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

	void displayInOrder() {
		inOrder(root);
	}

	void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left); // left
		System.out.print(root.data + " "); //root
		inOrder(root.right); // right
	}

}

class Demo5 {
	static void height(Node root) {
		if (root == null)
			return 1

		int left = height(root.left);
		int right = height(root.right)
	}
	public static void main(String[] args) {
		BST t = new BST();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);

		t.displayInOrder();
	}
}