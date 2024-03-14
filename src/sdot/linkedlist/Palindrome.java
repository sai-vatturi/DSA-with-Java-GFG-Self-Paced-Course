package sdot.linkedlist;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}
class SinglyLinkedList {
	Node head, tail;

	void insert(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = tail.next;
		}
	}

	void insertFirst(int x) {
		if (this.getSize() == 0) {
			insert(x);
		}
		Node newNode = new Node(x);
		Node temp = head;
		newNode.next = head;
		head = newNode;
	}


	void insertAt(int index, int x) {
		if (index == 0) {
			this.insertFirst(x);
			return;
		}
		
		int size = this.getSize();
		if (index >= size) {
			System.out.println("Given index is out of bounds!");
			return;
		} 
		else if (index == size - 1) {
			this.insert(x);
			return;
		}
		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node newNode = new Node(x);
		newNode.next = current.next;
		current.next = newNode;
	}

	void delete(int x) {
		Node current = head;
		while (current.next != null && current != null) {
			if (current.next.data == x) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}
	void deleteFirst() {
		if (this.getSize() == 1) {
			head = null;
			tail = null;
			return;
		}
		Node temp = head.next;
		head = temp;
	}
	void deleteLast() {
		if (this.getSize() == 1) {
			head = null;
			tail = null;
			return;
		}
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		
	}
	void deleteAt(int index) {
		if (index == 0) {
			deleteFirst();
			return;
		}
		if (index == this.getSize() - 1) {
			deleteLast();
		}
		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.next;
		}
		current.next = current.next.next;

	}
	int getSize() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	void display() {
		Node temp = head;
		if (temp == null) {
			System.out.println("List is empty!");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Palindrome {
	public static Node reverse(Node head) {
		Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}
	public static boolean isPalindrome(SinglyLinkedList l) {
		Node slow = l.head;
		Node current = slow;
		Node fast = slow;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			current = slow;
			slow = slow.next;
		}
		current.next = null;
		Node list2 = reverse(slow);

		Node temp1 = l.head;
		Node temp2 = list2;
		while (temp1 != null && temp2 != null) {
			if (temp1.data != temp2.data) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		SinglyLinkedList l1 = new SinglyLinkedList();
		for (int i = 0; i < n1; i++) {
			l1.insert(sc.nextInt());
		}
		System.out.println(isPalindrome(l1));
	}
}