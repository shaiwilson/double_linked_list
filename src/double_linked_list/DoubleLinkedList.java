package double_linked_list;

public class DoubleLinkedList {
	
	 	protected ListNode head;
	    protected ListNode tail;
	    
	    public DoubleLinkedList()
	    {
	        head = null;
	        tail = null;
	    }
	    
	    // Method add(Object o)
	    // Adds the object at the end of the linked list
	    public void add(Object o)
	    {
	        ListNode newElem = new ListNode(o);
	        if (tail != null)
	        {
	        	tail.setNext(newElem);
	        	newElem.setPrev(tail);
	        	tail =  tail.next();
	        }
	        else
	        {
	        	head = newElem;
	        	tail = newElem;
	        }
	    }
	    
	   
	    // Method reverse
	    // Reverses the string
	    public void reverse()
	    {
	    	ListNode curr = head;
			
			while (curr != null){
				ListNode nextNode = curr.next();
				curr.setNext(curr.prev()); 
				curr.setPrev(nextNode);
				
				if(nextNode != null)
				{
					nextNode.setNext(curr);
				}
				
				curr = curr.next();
			}
			
			ListNode oldHead = head;
			head = tail;
			tail = oldHead;
	    }
	    
	    // Method toString()
	    // Creates a String representation of the list:
	    //  Left bracket, followed by by concatenating the result of toString() 
	    //  called on each element of the list (separated by commas), fooled by a 
	    //  right bracket.
	    //  Empty list:  toString => "[]"
	    //  List containing the single Integer 3: toString => "[3]"
	    //  List containing three integers 1, 2, 3:  toString => "[1,2,3]"
	    public String toString()
	    {
		// Fill me in!
	        return "";
	    }
	    
	    
	    // Method removeFirst(Object o)
	    //  Removes the first occurrence of the Object o from the list.  If
	    //    the object appears more than once, only the first occurrence is
	    //    removed.  If the object does not occur in the list, the method
	    //    does nothing. removeFirst and removeLast should reuse as much
	    //    code as possible!
	    public void removeFirst(Object o)
	    {
		// FIll me in!
	    }
	    
	    // Method removeLast(Object o)
	    //  Removes the last occurrence of the Object o from the list.  If
	    //    the object appears more than once, only the first occurrence is
	    //    removed.  If the object does not occur in the list, the method
	    //    does nothing. removeFirst and removeLast should reuse as much
	    //    code as possible!
	    public void removeLast(Object o)
	    {
		// FIll me in!!
	    }
	    
	    
	    public static void main(String args[])
	    {
	    	DoubleLinkedList l = new DoubleLinkedList();
	    	l.add(new Integer(99));
	        for (int i = 0; i < 5; i++)
	        {
	            l.add(new Integer(i));
	        }
	    	l.add(new Integer(99));
	        for (int i = 5; i < 10; i++)
	        {
	            l.add(new Integer(i));
	        }
	    	l.add(new Integer(99));
	        
	        System.out.println(l);
	        l.reverse();
	        System.out.println(l);
	 
	        l.removeFirst(99);
	        System.out.println(l);
	        l.removeLast(new Integer(99));
	        System.out.println(l);
	        l.removeLast(new Integer(99));
	        System.out.println(l);
	        l.removeLast(new Integer(9));
	        System.out.println(l);

	        DoubleLinkedList l2 = new DoubleLinkedList();
	        System.out.println(l2);
	        l2.add(new Integer(2));
	        System.out.println(l2);
	        l2.removeLast(new Integer(2));
	        System.out.println(l2);

	    }
}