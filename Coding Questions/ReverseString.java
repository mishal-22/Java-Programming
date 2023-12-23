package snippet;

import java.util.Scanner;
import java.util.Stack;


// Reverse String without reversing space
//I am Learning Java
//a va Jgninrae LmaI

public class ReverseString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	String string=scanner.nextLine();
	String result=reverse(string);
	System.out.println(result);
}
public static String reverse(String str) {
	char[] result=new char[str.length()];
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			result[i]=str.charAt(i);
		}
	}
	String str1=str.replace(" ", "");
	char[] arr1=str1.toCharArray();
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<arr1.length;i++) {
		stack.push(arr1[i]);
	}
	for(int i=0;i<result.length;i++) {
		if(!(result[i]==' ')) {
			result[i]=stack.pop();
		}
	}
	return new String(result);
	
}
}
