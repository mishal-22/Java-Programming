package dataStructure.learn;

public class DoublyLinkedList {
  private static  ListNode head;
  private  ListNode tail;
    int length;
    public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
    	this.head=null;
    	this.tail=null;
    	this.length=0;
    	
	}
    
     private static class ListNode{
    	int data;
    	ListNode next;
    	ListNode previous;
    	 ListNode(int data) {
			this.data=data;
			this.next=null;
			this.previous=null;
			
		}
    }
    public boolean isEmpty() {
    	return length==0;
    }
    public void insert(int data) {
    	ListNode newNode=new ListNode(data);
    	if(isEmpty()) {
    	   head=newNode;
    	}
    	else {
    		head.previous=newNode;
    		
    	}
    	newNode.next=head;
    	head=newNode;
    	length++;
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
		DoublyLinkedList list=new DoublyLinkedList();
		
		list.head=new ListNode(20);
		ListNode second=new ListNode(10);
		ListNode third=new ListNode(30);
		head.previous=null;
		head.next=second;
		second.previous=head;
		second.next=third;
		third.previous=second;
		list.print();
		list.insert(40);
		list.insert(50);
		list.print();
		
	}
}
