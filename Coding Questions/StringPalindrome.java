package snippet;

import java.util.Iterator;
import java.util.Stack;

public class StringPalindrome {
public static void main(String[] args) {
	String s1="malayalam";
//	String copy="";
//	for(int i=s1.length()-1;i>=0;i--) {
//		copy=copy+s1.charAt(i);
//	}
//	
//	if(s1.equals(copy)) {
//		System.out.println("Palindrome");
//	}
//	else {
//		System.out.println("not");
//	}
	Stack<Character> stack=new Stack<Character>();
	char[] result=s1.toCharArray();

	for(char c : result) {
		stack.push(c);
	}
	for(int i=0;i<s1.length();i++) {
		result[i]=stack.pop();
	}
	if(s1.equals(new String(result))) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
