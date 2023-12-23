//14. Longest Common Prefix
//Solved
//Easy
//Topics
//Companies
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

package codingQuestions;

import java.util.Scanner;

public class LongestPrefix {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array");
	String[] arr=new String[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.next();
	}
	longestPrefix(arr);
}

private static void longestPrefix(String[] arr) {
	// TODO Auto-generated method stub
	String prefix=arr[0];
	for(int i=0;i<arr.length;i++) {
		String current=arr[i];
		int j=0;
		while(j<prefix.length()&& j<current.length() && prefix.charAt(j)==current.charAt(j)) {
			j++;
		}
		prefix=prefix.substring(0,j);
	}
	System.out.println(prefix);
	
}
}
