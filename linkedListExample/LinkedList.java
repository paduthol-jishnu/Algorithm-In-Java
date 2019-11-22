package linkedListExample;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class LinkedList {
	private Node head;
	
	public void insertAtHead(int data) {
		
		Node newNode= new Node(data);
		newNode.setNextNode(this.head);
		this.head=newNode;
	}
	
	public int length() {
		Node current=this.head;
		int length=0;
		while(current != null) {
			length++;
			current=current.getNextNode();
		}
		return length;
	}
	
	public void deleteFromHead(){
		Node current=this.head;
		this.head=current.getNextNode();
	}
	
	public Node find(int data) {
		Node current=this.head;
		int length=0;
		while(current !=null ) {
			if(current.getData()==data) {
				return current;
			}
			current=current.getNextNode();
		}
		return null;
	}
	
	public String toString() {
		String result ="{";
		Node current = this.head;
		while(current != null) {
			result=result+current.toString()+",";
			current=current.getNextNode();
		}
		result += "}";
		return result;
		
		
	}
}
