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
	    	// swap head and tail
	    	ListNode curr = head;
	    	head = tail;
	    	tail = curr;
	    	
	    	// new head = old tail
	    	ListNode start = head;
			
			while (start != null){
				curr = curr.next();
				start.setNext(start.prev()); 
				start.setPrev(curr);
				start = start.next();
				
			}
			
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
	    	if (head == null) {
				
				return "[]";
				
			} else {
				
				String result = "[" + head.data();
				ListNode current = head.next();
				
				while (current != null) {
					
					result += ", " + current.data();
					current = current.next();
					
				}
				
				result += "]";
				return result;
			}
	    }
	    
	    
	    // Method removeFirst(Object o)
	    //  Removes the first occurrence of the Object o from the list.  If
	    //    the object appears more than once, only the first occurrence is
	    //    removed.  If the object does not occur in the list, the method
	    //    does nothing. removeFirst and removeLast should reuse as much
	    //    code as possible!
	    public void removeFirst(Object o)
	    {
//	    	System.out.println(o);
	    	int pos = 0; // track pos of current link in the list
	    	ListNode curr = head; // start at begin
//	    	ListNode occurence = head; // remember last occurrence
	    	int count = 0; // # of occurrences
	    	ListNode prev = curr.prev();
	    	

	    	if (head.data().equals(o)){
	    	
	    		head = curr.next();
	    		head.setPrev(null);
	    		curr = curr.next();
	    		count++;
	    	}
	    	
	    	
	    	while (curr != null){
	    		
	    		if(curr.data().equals(o) & count == 0){
	    			System.out.print("curr data: ");
	    			System.out.println(curr.data());
	    			
	    			prev.setNext(curr.next());
	    			System.out.print("prev data: ");
	    			System.out.println(prev.data());
	    			
	    			
//	    			System.out.println(curr.next());
	    			
	    		
	    			count++;
	    			
	    		}
	    		
	    		curr = curr.next();
	    		
	    	
	    		
	    	}
	    	

	    }
	 
	    
	    
	    // Method removeLast(Object o)
	    //  Removes the last occurrence of the Object o from the list.  If
	    //    the object appears more than once, only the first occurrence is
	    //    removed.  If the object does not occur in the list, the method
	    //    does nothing. removeFirst and removeLast should reuse as much
	    //    code as possible!
	    public void removeLast(Object o)
	    {
	   
	        	

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
