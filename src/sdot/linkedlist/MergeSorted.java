//package sdot.linkedlist;
//
//import java.util.Scanner;
//
//class Node {
//	int data;
//	Node next;
//	Node(int data) {
//		this.data = data;
//	}
//}
//class SinglyLinkedList {
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
//}
//
//public class MergeSorted {
//	public static SinglyLinked merge(SinglyLinked l1, SinglyLinked l2) {
//		Node temp1 = l1.head;
//		Node temp2 = l2.head;
//		SinglyLinked result = new SinglyLinked();
//		while (temp1 != null && temp2 != null) {
//			if (temp1.data <= temp2.data) {
//				result.insert(temp1.data);
//				temp1 = temp1.next;
//			} else {
//				result.insert(temp2.data);
//				temp2 = temp2.next;
//			}
//		}
//		while (temp1 != null) {
//			result.insert(temp1.data);
//			temp1 = temp1.next;
//		}
//		while (temp2 != null) {
//			result.insert(temp2.data);
//			temp2 = temp2.next;
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		/* Sample Input:
//							3
//							1 3 5
//							3
//							2 4 6
//		*/
//		int n1 = sc.nextInt();
//		SinglyLinked l1 = new SinglyLinked();
//		for (int i = 0; i < n1; i++) {
//			l1.insert(sc.nextInt());
//		}
//		SinglyLinked l2 = new SinglyLinked();
//		int n2 = sc.nextInt();
//		for (int i = 0; i < n2; i++) {
//			l2.insert(sc.nextInt());
//		}
//		SinglyLinked l3 = merge(l1, l2);
//		l3.display();
//	}
//}