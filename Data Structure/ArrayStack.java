package dataStructure.learn;

public class ArrayStack {
        static int max=1000;
        int top;
        int[] arr=new int[max];
        public ArrayStack() {
        	top=-1;
        }
        public boolean isEmpty() {
        	return (top<0);
        }
        public void push(int x) {
        	if(top>max) {
        		System.out.println("Stack overflow");
        		return;
        	}
        	top++;
        	arr[top]=x;
        	System.out.println("item added to the stack");
        }
        public void pop() {
        	if(top<0) {
        		System.out.println("Stack underflow");
        		return;
        	}
        	int temp=arr[top];
        	top--;
        	System.out.println(temp+" removed from top");
        }
        public void print() {
        	for(int i=top;i>-1;i--) {
        		System.out.print(" "+arr[i]);
        	}
        	System.out.println();
        }
        public void length() {
        	System.out.println(top+1);
        }
        public static void main(String[] args) {
			ArrayStack stack=new ArrayStack();
			stack.push(10);
			stack.push(20);
			stack.print();
			stack.pop();
			stack.print();
			System.out.println(stack.isEmpty());
			stack.push(20);
			stack.print();
			stack.length();
		}
}
