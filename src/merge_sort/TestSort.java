package merge_sort;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
	
	
	
	
	public static ListNode mergeSort(ListNode list)
	{
		return null;					
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
