package LinkedList;


class Node 
{ 
    int data; 
    Node next; 
    Node(int d)  { data = d;  next = null; } 
}

public class FindKthToLastElement {	
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

		public int kthToLastElement(Node head,int n) {
			// TODO Auto-generated method stub
			int length=0;
			Node current=new Node(0);
			current.next=head;
			
			while(head!=null) {
				length++;
				head=head.next;
			}
			
			length=length-n;
			head=current;
			
			while(length>0) {
				length--;
				head=head.next;
			}
			
			
			return head.next.data;
		} 
	
	public static void main(String[] args) 
    { 
        /* Start with the empty list */
		FindKthToLastElement llist = new FindKthToLastElement(); 
        llist.push(1); 
        llist.push(2); 
        llist.push(3); 
        llist.push(4); 
        llist.push(5); 
  //5->4->3->2->1
        System.out.println("Count of nodes is " + llist.kthToLastElement(llist.head,2)); 
    }


}
