import java.util.NoSuchElementException;


public class Stack {              //create stack class
    ListNode top;                   //adding and removing element from top of the stack ,so creating a variable top as pointer
    int length;                     //create variable length for printing length stack
    class ListNode{               //create linked list for creating stack
    	int data;                // data part
    	ListNode next;           //address part
    	public ListNode(int data) {     //create new node while constructor calling
    		this.data=data;
    		this.next=null;
    	}
    }
    public Stack() {        //initially stack length is 0 and top is null
    	top=null;
    	length=0;
    }
    public boolean isEmpty() {       //checking stack is empty or not
		return length==0;
	}
    public int length() {            //print length of stack
		return length;
	}
    public void display() {           //display stack
    	if(top==null) {
    		return;
    	}
    	ListNode current=top;
    	while(current!=null) {
    		System.out.print(current.data+"-->");
    		current=current.next;
    	}
    	System.out.print("null");
    	System.out.println();
    }
    public void push(int x) {                 //adding element to the top of the stack
    	ListNode newNode=new ListNode(x);     //creating new node
    	if(top==null) {
    		top=newNode;
    	}
    	else {
    		
			newNode.next=top;       //only can add the top{head of linked list) of the stack
			top=newNode;
			length++;
		}
    }
    public void pop(){                // remove element from top of the stack
    	if(top==null) {
    		throw new NoSuchElementException();
    	}
    	top=top.next;
    	length--;
    }
    public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		stack.pop();
		stack.display();
	}
}
