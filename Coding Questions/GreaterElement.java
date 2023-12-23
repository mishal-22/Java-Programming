package snippet;

import java.util.Stack;

public class GreaterElement {
public static void main(String[] args) {
	int[] arr= {4,17,1,6,5,6};
	int[] result=new int[arr.length];
	Stack<Integer> stack=new Stack<Integer>();
    for(int i=arr.length-1;i>=0;i--) {
    	if(!stack.isEmpty()) {
    		while(!stack.isEmpty() && stack.peek()<=arr[i]) {
    			stack.pop();
    		}
    	}
    	if(stack.isEmpty()) {
    		result[i]=-1;
    	}
    	else {
			result[i]=stack.peek();
		}
    	stack.push(arr[i]);
    }
    for(int i:result) {
    	System.out.print(i+" ");
    }
	
}
}
