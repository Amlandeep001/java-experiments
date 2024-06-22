package com.org.codingninjas.linkedlist;

//https://www.naukri.com/code360/problems/middle-of-linked-list_973250?topList=striver-sde-sheet-problems&problemListRedirection=true&search=linked&leftPanelTabValue=PROBLEM
public class MiddleOfLinkedList
{
	public static Node findMiddle(Node head)
	{
		// Write your code here.

		// Initialize slow pointer to the head of the linked list
		Node slow = head;
		// Initialize fast pointer to the head of the linked list
		Node fast = head;

		// Traverse the linked list with two pointers: slow and fast
		// slow moves one node at a time, while fast moves two nodes at a time
		// so if fast pointers covers all the nodes then on that time slow will be at (n/2) node .which is the middle;
		while (fast != null && fast.next != null)
		{
			// Move slow pointer to the next node
			slow = slow.next;
			// Move fast pointer to the next two nodes
			fast = fast.next.next;
		}
		// Return the Node object representing the middle node of the linked list
		return slow;
	}

}

class Node
{
	public int data;
	public Node next;

	Node()
	{
		this.data = 0;
		this.next = null;
	}

	Node(int data)
	{
		this.data = data;
		this.next = null;
	}

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}
