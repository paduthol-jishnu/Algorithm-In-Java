package LinkedList;

//class Node 
//{ 
//    int data; 
//    Node next; 
//    Node(int d)  { data = d;  next = null; } 
//}

public class deleteTheParticularElement {

    Node head;  // head of list 
	  
    /* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node &  Put in the data*/
        Node new_node = new Node(new_data); 
        /* 3. Make next of new Node as head */
        new_node.next = head; 
        /* 4. Move the head to point to new Node */
        head = new_node; 
    }
	
    public void deleteTheParticularElement(Node n) {
    	
    	n.data=n.next.data;
    	n.next=n.next.next;
    	
    }
	
	
    
    
    
	public static void main(String[] args) 
    { 
        /* Start with the empty list */
		deleteTheParticularElement llist = new deleteTheParticularElement(); 
        llist.push(1); 
        llist.push(2); 
        llist.push(3); 
        llist.push(4); 
        llist.push(5); 
  //5->4->3->2->1
        llist.deleteTheParticularElement(llist.head.next.next);
        System.out.println("Count of nodes is " + llist); 
    }
}
