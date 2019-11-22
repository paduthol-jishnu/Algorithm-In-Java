//14/10/2019


package LinkedList;

import java.util.HashSet;

public class removeDuplicatesLL {
	
	static class node  
    { 
        int val; 
        node next; 
  
        public node(int val)  
        { 
            this.val = val; 
        } 
    } 
	
	
	public static void removeDuplicatesLL(node head) {
	
		//We created a new Hashset hs------>(Empty one)
		HashSet<Integer> hs=new HashSet<Integer>();
		
		//We gave current node value head
		node current=head;
		node previous=null;
		
		
		//The loop will break when current becomes null
		//if the hashset(hs) contains current value then we just point previous.next to current.next
		//else i.e its unique so we add into our hashset and [IMPORTANT] we point our previous to current
		// [IMPORTANT] current will e equal to cuurent.next
		while(current!=null) {
			
			int currentValue= current.val;
			
			if(hs.contains(currentValue)) {
				
				previous.next=current.next;
				
			}else {
				hs.add(currentValue);
				previous=current;
			}
			current=current.next;
			
		}
		
	}
	
	
	
	
	
	
	
	
	static void printList(node head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.val + " "); 
            head = head.next; 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        /* The constructed linked list is: 
         10->12->11->11->12->11->10*/
        node start = new node(10); 
        start.next = new node(12); 
        start.next.next = new node(11); 
        start.next.next.next = new node(11); 
        start.next.next.next.next = new node(12); 
        start.next.next.next.next.next = new node(11); 
        start.next.next.next.next.next.next = new node(10); 
  
        System.out.println("Linked list before removing duplicates :"); 
        printList(start); 
  
        removeDuplicatesLL(start); 
  
        System.out.println("\nLinked list after removing duplicates :"); 
        printList(start); 
    } 
} 


