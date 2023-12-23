//Given a string S consisting of lowercase Latin Letters. Return the first non-repeating 
//character in S. If there is no non-repeating character, return '$'.
//
//Example 1:
//
//Input:
//S = hello
//Output: h
//Explanation: In the given string, the
//first character which is non-repeating
//is h, as it appears first and there is
//no other 'h' in the string.

package string.interview;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Integer> res=new HashMap<Character, Integer>();
		System.out.println("Enter the string");
		String str = scanner.nextLine();
        char[] ch=str.toCharArray();
        for(char c:ch) {
        	res.put(c, res.getOrDefault(c,0)+1);
        }
        for(char c:ch) {
        	if(res.get(c)==1) {
        		System.out.println(c);
        		return;
        	}
        }
        System.out.println("$");
	}

}
