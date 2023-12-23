//20. Valid Parentheses
//Solved
//Easy
//Topics
//Companies
//Hint
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
// 
//
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false

package codingQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=scanner.next();
	System.out.println(checkValidity(string));
}

private static boolean checkValidity(String string) {
	// TODO Auto-generated method stub
	char[] arr=string.toCharArray();
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='('||arr[i]=='{'|| arr[i]=='[') {
			stack.push(arr[i]);
		}
		else if(!stack.isEmpty()&&((arr[i]==']'&& stack.peek()=='[')||(arr[i]==')'&& stack.peek()=='(')||(arr[i]=='}'&& stack.peek()=='{'))) {
			stack.pop();
		}
		else {
			return false;
		}
	}
	if(!stack.isEmpty()) {
		return false;
	}
	return true;
	
}
}
