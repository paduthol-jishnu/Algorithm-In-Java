package stack;

public class ImplementingStackUsingArray {

	static final int max=100;
	int top=-1;
	int [] a=new int[max];

	
	boolean push(int data) {
		
		if(top>max) {
			return false;
		}
		else {
			a[++top]=data;
			System.out.println("Value has been pushed"+a[top]);
			return true;
		}
		
	}
	
	
	int pop() {
		
		if(top<0) {
			System.out.println("The stack is empty");
			return 0;
		}
		else {			
			int x= a[top--];
			
			return x;			
		}
	}
	
	
	int peek() {
		if(top<0) {
		System.out.println("The stack is empty");
		return 0;
		}
		else {
			return a[top];
		}
	}
	
	
	public static void main(String[] args) {
		ImplementingStackUsingArray stack=new ImplementingStackUsingArray();
		stack.push(100);
		stack.push(15);
		stack.push(25);
		stack.push(80);
		
		
		System.out.println("Value popped first time"+stack.pop());
		System.out.println("Value popped second time"+stack.pop());
		System.out.println("Value peeked"+stack.peek());
	}
}
