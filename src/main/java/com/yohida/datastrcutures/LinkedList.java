package com.yohida.datastrcutures;

import java.util.Scanner;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node add(Node head, int data) {
		Node n = new Node(data);
		if (head == null) {
			return n;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = n;
		return head;
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

	void ReversePrint(Node head) {

		if (head == null) {
			return;
		}
		ReversePrint(head.next);
		System.out.println(head.data);

	}

	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		Scanner scan = new Scanner(System.in);
		Node head = l.add(null, scan.nextInt());
		head = l.add(head, scan.nextInt());
		head = l.add(head, scan.nextInt());

		l.Print(head);
		scan.close();
	}
}
