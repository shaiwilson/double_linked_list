package merge_sort;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
	
	
	
	
	public static ListNode mergeSort(ListNode list)
	{
		
		if (list == null || list.next == null)
		{
			return list;
		}
		
		ListNode first = list;
		ListNode second = list.next;
		
		while((second != null) && (second.next != null))
		{
			list = list.next;
			second = second.next.next;
			
		}
		second = list .next;
		list.next = null;
		
		
		return merge(mergeSort(first), mergeSort(second));
		
					
	}
	
	public static ListNode merge(ListNode first, ListNode second)
	{
		ListNode tmp = new ListNode();
		ListNode head = tmp;
		ListNode result = head;
		
		while((first != null) && (second != null))
		{
			if(first.data <= second.data)
			{
				result.next = first;
				result = first;
				first = first.next;
			}
			
			else
			{
				result.next = second;
				result = second;
				second = second.next;
			}
		}
		
		if (first == null)
		{
			result.next = second;
		}
		else 
		{
			result.next = first;
		}
		
		return head.next;
		
	}
	
	

	public static void main(String args[])
	{
		final int SIZE = 10000;
		Random r = new Random();
		
		int data[] = new int[SIZE];
		ListNode list = null;
		
		for (int i = 0; i < SIZE; i++)
		{
			data[i] = r.nextInt();
			list = new ListNode(data[i], list);
		}
		
		
		list = mergeSort(list);
		Arrays.sort(data);
		
		ListNode tmp = list;
		boolean dataMismatch = false;
		boolean badList = false;
		for (int i = 0; i < SIZE; i++)
		{
			if (tmp == null)
			{
				badList = true;
				break;
			}
			if (data[i] != tmp.data)
			{
				dataMismatch = true;
			}
			tmp = tmp.next;
		}
		if (tmp != null)
		{
			badList = true;
		}
		
		if (badList)
		{
			System.out.println("List is the wrong length");
		}
		if (dataMismatch)
		{
			System.out.println("Data not sorted propertly");
		}
		if (!badList && !dataMismatch)
		{
			System.out.println("Success!");
		}
		
		
	}
	
	

}
