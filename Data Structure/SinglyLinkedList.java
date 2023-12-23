package dataStructure.learn;


public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void length() {
		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		System.out.println(count);
	}

	public void insertBeginning(int item) {
		ListNode newListNode = new ListNode(item);
		newListNode.next = head;
		head = newListNode;

	}

	public void insertAtEnd(int item) {
		ListNode newItem = new ListNode(item);
		if (head == null) {
			head = newItem;
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newItem;

	}

	public void insertAtGivenPosition(int item, int pos) {
		ListNode newListNode = new ListNode(item);
		if (pos == 1) {
			newListNode.next = head;
			head = newListNode;
		} else {
			ListNode prevListNode = head;
			int count = 1;
			while (count < pos - 1) {
				prevListNode = prevListNode.next;
				count++;
			}
			ListNode currentListNode = prevListNode.next;
			prevListNode.next = newListNode;
			newListNode.next = currentListNode;
		}
	}
    
	public void deleteFromFirst() {
		ListNode temp=head;
		head=head.next;
		temp.next=null;
	}
	public void deleteFromLast() {
		if(head.next==null) {
			head=null;
		}
		else {
			ListNode currentListNode=head;
			ListNode prevListNode=null;
			while(currentListNode.next!=null) {
				prevListNode=currentListNode;
				currentListNode=currentListNode.next;
				
			}
			prevListNode.next=null;
		}
	}
	 public void deleteFromGivenPosition(int pos) {
		 if(pos==1 || head.next==null) {
			 head=null;
		 }
		 else {
			 ListNode currentListNode=head;
			 ListNode prevListNode=null;
			 int count=1;
			 while(count<=pos-1) {
				 prevListNode=currentListNode;
				 currentListNode=currentListNode.next;
				 count++;
			 }
			 prevListNode.next=currentListNode.next;
		 }
	 }
	 public void search(int item) {
		 ListNode current=head;
		 int pos=1;
		 while(current!=null) {
			 if(item==current.data) {
				 System.out.println("Item "+item+" found at the position "+pos);
				 return;
			 }
			 current=current.next;
			 pos+=1;
			 
		 }
	 }
	 public void reverse() {
		 ListNode current=head;
		 ListNode next=null;
		 ListNode previous=null;
		 while(current!=null) {
			 next=current.next;
			 current.next=previous;
			 previous=current;
			 current=next;
		 }
		 head=previous;
	 }
	 public void middle() {
		 ListNode current=head;
		 int count=1;
		 while(current.next!=null) {
			 current=current.next;
			 count++;
			 
		 }
		 int middlePos=count/2;
		 current=head;
		 count=1;
		 while(count<=middlePos) {
			current=current.next;
			count++;
		 }
		 System.out.println("middle element is "+current.data);
	 }
	 public void nThformEnd(int pos) {
		 int count=1;
		 ListNode current=head;
		 ListNode last=head;
		 while(count<=pos) {
			 last=last.next;
			 count++;
		 }
		 while(last!=null) {
			 last=last.next;
			 current=current.next;
		 }
		 System.out.println(pos+"nth node from end is "+current.data);
	 }
	 public void sort() {
		 ListNode current=head;
		 while(current!=null) {
			 ListNode nextNode=current.next;
			 while(nextNode!=null) {
				 if(current.data>nextNode.data) {
					 int temp=current.data;
					 current.data=nextNode.data;
					 nextNode.data=temp;
				 }
				 nextNode=nextNode.next;
			 }
			 current=current.next;
		 }
		 
		 
	 }
	 public void removeDuplicate() {
		 sort();
		 ListNode current=head;
		 while(current!=null) {
			 ListNode nextNode=current.next;
			 while(nextNode!=null) {
				 if(current.data==nextNode.data) {
					 current.next=nextNode.next;
				 }
				 nextNode=nextNode.next;
			 }
			 current=current.next;
			 
		 }
	 }
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		sl.head.next = second;
		second.next = third;
		third.next = fourth;
		sl.display();
		sl.length();
		sl.insertAtGivenPosition(50, 3);
		sl.display();
		sl.search(50);
		sl.reverse();
		sl.display();
		sl.middle();
		sl.nThformEnd(2);
		sl.sort();
		sl.display();
		sl.insertAtEnd(30);
		sl.insertAtGivenPosition(50, 4);
		sl.display();
		sl.sort();
		sl.removeDuplicate();
		sl.display();
		
		
		

	}

}
