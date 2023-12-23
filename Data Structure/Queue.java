import java.util.NoSuchElementException;

import javax.naming.spi.DirStateFactory.Result;

public class Queue {
	ListNode front;
	ListNode rear;
	int length;

	class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}
	public Queue() {
		this.front=null;
		this.rear=null;
		this.length=0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public void enqueue(int x) {
		ListNode newNode = new ListNode(x);
		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;

	}

	public int dequeue() {
		int result;
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			 result=front.data;
			front = front.next;
		}
		length--;
		return result;
	}
     public void display() {
    	 if(isEmpty()) {
             return;
    	 }
    	 else {
    		 ListNode current=front;
    		 while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
    		 }
    		 System.out.print("null");
		}
     }

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.enqueue(30);
		q.display();
	}
}
