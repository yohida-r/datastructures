package com.yohida.datastrcutures;

public class LinkedList {

	static class Node {
		int data;
		Node next;
	}

	void Print(Node head) {
		if (head == null || head.next == null) {
			return;
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	}

	public static void main(String args[]) {

		LinkedList llist = new LinkedList();
		Node head = new Node();
		head.data = 5;
		head.next = new Node();
		head.next.data = 1;
		head.next.next = new Node();
		head.next.next.data = 10;

		llist.Print(head);
	}
}
