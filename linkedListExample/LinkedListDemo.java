package linkedListExample;

public class LinkedListDemo {
public static void main(String[] args) {
	
	
	
	LinkedList ll= new LinkedList();
	
	ll.insertAtHead(10);
	ll.insertAtHead(15);
	ll.insertAtHead(10);
	ll.insertAtHead(15);
	ll.insertAtHead(10);
	ll.insertAtHead(12);
	ll.insertAtHead(10);
	ll.insertAtHead(15);
	ll.insertAtHead(10);
	ll.insertAtHead(15);
	
	ll.deleteFromHead();
	System.out.println(ll);
	System.out.println("Length of the LinkedList is="+ll.length());
	System.out.println(ll.find(12));
}
	
}
