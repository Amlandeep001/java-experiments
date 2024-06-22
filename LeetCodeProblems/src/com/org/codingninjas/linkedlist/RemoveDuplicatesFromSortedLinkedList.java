package com.org.codingninjas.linkedlist;

//https://www.naukri.com/code360/problems/unique-sorted-list_2420283?interviewProblemRedirection=true&search=linked%20list&leftPanelTabValue=PROBLEM&count=25&page=1&sort_entity=order&sort_order=ASC&attempt_status=COMPLETED&customSource=studio_nav
public class RemoveDuplicatesFromSortedLinkedList
{
	public static Node uniqueSortedList(Node head)
	{
		// Write your code here.

		Node current = head;

		while (current != null && current.next != null)
		{
			if(current.data == current.next.data)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
		return head;
	}
}
