

public class MaxHeap {
  Integer[] heap;                //creating an heap array for priority queue
  int n;                            // declaring size heap
  public MaxHeap(int capacity) {          // Implicitly initializing size of array
	  heap=new Integer[capacity+1];      // initializing size of array size+1(bcz elements starts from 1)     
	  n=0;                                 //Initially heap is empty;
  }
  public boolean isEmpty() {
	  return n==0;
	  
  }
  public int size() {
	  return n;
  }
  public void resize(int n) {                            //resize the size of heap array
	  Integer[] temp=new Integer[n];                   //creating new array
	  for(int i=1;i<heap.length;i++) {
		  temp[i]=heap[i];                          //assigning each element in the heap into new array. 
	  }
	  heap=temp;                                      //assigning heap reference to the new array. 
  }
  public void insert(int x) {                   //insert elements to the heap
	  if(n==heap.length-1) {                     //checking the size of heap is equal to length of array then increase the 
		  resize(2*heap.length);                          //size of array
	  }
	  n++;                                  
	  heap[n]=x;
	  swim(n);                             //calling the method swim() for Bottom-up reheapify(shift Up)
  }
  public void swim(int k) {                  //checking the value of parent node is greater than child 
	  while(k>1 && heap[k/2]<heap[k]) {        //(k/2)--> parent   (k)-->child
		  int temp=heap[k];
		  heap[k]=heap[k/2];
		  heap[k/2]=temp;
		  k=k/2;                       //assigning parent as the child for further checking.
	  }
  }
  public void deleteMax() {              //deleting top element in the heap.
	  int max=heap[1];                     
	  swap(1,n);                            //for deleting top value initially it swap with last element in the heap.
	  n--;                                   //decrease the size of heap by one
	  sink(1);                               //calling the method sink() for Top-down reheapify(shift down)
	  heap[n+1]=null;
	  if(n>0&&(n==(heap.length-1)/4)) {             //checking the size of heap,if the size of heap array equal to 1/4 th of heap.
		  resize(heap.length/2);                      // then resize the array by two
	  }
  }
  public void sink(int k) {                    
	  while(2*k<=n) {                          //checking child of top (k) is less than size of heap tree.
		  int j=2*k;                            //initializing the right child to the variable j
		  if(j<n&&heap[j]<heap[j+1]) {           //checking  child is less than size of heap tree and right child is less than
			  j++;                              // left child, if true then select child as left child.
		  }
		  if(heap[k]>=heap[j]) {                    //if child is less than parent then terminate loop
			  break;
		  }
		  swap(k, j);                         //other wise swap parent and child
		  k=j;                                   //set child as new parent and repeat the process
	  }
  }
  public void swap(int a,int b) {
	  int temp=heap[a];                 //swap to elements in the heap
	  heap[a]=heap[b];
	  heap[b]=temp;
  }
  public void show() {
	  for(Integer n:heap) {
		  System.out.print(n+" ");
	  }
  }
  public static void main(String[] args) {
	MaxHeap pq=new MaxHeap(3);        // creating heap with size 4. 
	pq.insert(1);
	pq.insert(3);
	pq.insert(5);
	pq.insert(12);
	pq.deleteMax();
	pq.show();
	
}
}
