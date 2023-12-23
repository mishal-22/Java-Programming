package dataStructure.learn;

public class LinkedListStack {
	ListNode head;
	
	private class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void push(int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void pop() {
		if(head==null) {
			System.out.println("Stack overflow");
			return;
		}
		int temp;
		temp=head.data;
		head=head.next;
		System.out.println(temp+" is popped from top");
	}
	public void isEmpty() {
		System.out.println(head==null);
	}
	public void print() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedListStack stack=new LinkedListStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.print();
		stack.pop();
		stack.print();
		stack.isEmpty();
		stack.pop();
		stack.pop();
		stack.isEmpty();
	}

}
