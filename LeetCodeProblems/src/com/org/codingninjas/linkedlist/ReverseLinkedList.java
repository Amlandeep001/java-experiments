package com.org.codingninjas.linkedlist;

//https://www.codingninjas.com/studio/problems/reverse-the-singly-linked-list_799897?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM
public class ReverseLinkedList
{
	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}

		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> previous = null;

		while (current != null)
		{
			LinkedListNode<Integer> nextElement = current.next;
			current.next = previous;
			previous = current;
			current = nextElement;
		}
		return previous;
	}
}

class LinkedListNode<T>
{
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data)
	{
		this.data = data;
	}
}
