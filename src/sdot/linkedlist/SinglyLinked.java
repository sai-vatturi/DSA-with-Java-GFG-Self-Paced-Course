//package sdot.linkedlist;
//
//class Node {
//	int data;
//	Node next;
//	Node(int data) {
//		this.data = data;
//	}
//}
//class SinglyLinked {
//	Node head, tail;
//
//	void insert(int x) {
//		Node newNode = new Node(x);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		} else {
//			tail.next = newNode;
//			tail = tail.next;
//		}
//	}
//
//	void insertFirst(int x) {
//		if (this.getSize() == 0) {
//			insert(x);
//		}
//		Node newNode = new Node(x);
//		Node temp = head;
//		newNode.next = head;
//		head = newNode;
//	}
//
//
//	void insertAt(int index, int x) {
//		if (index == 0) {
//			this.insertFirst(x);
//			return;
//		}
//
//		int size = this.getSize();
//		if (index >= size) {
//			System.out.println("Given index is out of bounds!");
//			return;
//		}
//		else if (index == size - 1) {
//			this.insert(x);
//			return;
//		}
//		Node current = head;
//		for (int i = 0; i < index - 1; i++) {
//			current = current.next;
//		}
//		Node newNode = new Node(x);
//		newNode.next = current.next;
//		current.next = newNode;
//	}
//
//	void delete(int x) {
//		Node current = head;
//		while (current.next != null && current != null) {
//			if (current.next.data == x) {
//				current.next = current.next.next;
//			}
//			current = current.next;
//		}
//	}
//	void deleteFirst() {
//		if (this.getSize() == 1) {
//			head = null;
//			tail = null;
//			return;
//		}
//		Node temp = head.next;
//		head = temp;
//	}
//	void deleteLast() {
//		if (this.getSize() == 1) {
//			head = null;
//			tail = null;
//			return;
//		}
//		Node temp = head;
//		while (temp.next != tail) {
//			temp = temp.next;
//		}
//		tail = temp;
//		tail.next = null;
//
//	}
//	void deleteAt(int index) {
//		if (index == 0) {
//			deleteFirst();
//			return;
//		}
//		if (index == this.getSize() - 1) {
//			deleteLast();
//		}
//		Node current = head;
//		for (int i = 1; i < index; i++) {
//			current = current.next;
//		}
//		current.next = current.next.next;
//
//	}
//	int getSize() {
//		Node temp = head;
//		int count = 0;
//		while (temp != null) {
//			temp = temp.next;
//			count++;
//		}
//		return count;
//	}
//	void display() {
//		Node temp = head;
//		if (temp == null) {
//			System.out.println("List is empty!");
//			return;
//		}
//		while (temp != null) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//		System.out.println();
//	}
//	public static void main(String[] args) {
//		// Linked List Methods
//
//		// insert(data), insertAt(index, data), insertFirst
//		// delete(data), deleteFirst, deleteLast, deleteAt
//		// display, getSize()
//		SinglyLinked l = new SinglyLinked();
//
//		l.display();
//		l.insert(5);
//		l.insert(6);
//		l.insert(10);
//		l.insert(7);
//		System.out.println("Should print 5, 6, 10, 7");
//		l.display();
//		l.delete(6);
//		l.insertFirst(0);
//		System.out.println("Should print 0, 5, 10, 7");
//		l.display();
//		l.insertAt(2, 4);
//		System.out.println("I should print 0, 5, 4, 10, 7");
//		l.display();
//		System.out.println(l.getSize());
//	}
//}
//
