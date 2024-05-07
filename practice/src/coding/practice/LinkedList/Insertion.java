package coding.practice.LinkedList;

public class Insertion {

	public static class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void traversal(Node head) {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.val + " ");
			ptr = ptr.next;
		}
		System.out.println();
	}

	public static Node insertAtFront(Node head, int data) {

		Node newNode = new Node(data);
		Node temp = head;
		head = newNode;
		head.next = temp;
		return head;

	}

	public static Node insertAtLast(Node head, int data) {

		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;

	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);

		traversal(head);
		head = insertAtFront(head, 5);
		System.out.println("after insertion at front");
		traversal(head);

		head = insertAtLast(head, 70);
		System.out.println("after insertion at Last");
		traversal(head);
	}

}
