//Given a string check if it is Panagram or not. A panagram is a sentence containing 
//every letter in the English Alphabet (either lowercase or uppercase or both). For example, 
//we say the letter A is present in the string if either 'a' is present or 'A' is present.
//
//Example 1:
//
//Input:
//S = Bawds jog, flick quartz, vex nymph
//Output: 1
//Explanation: In the given input, there
//are all the letters of the English
//alphabet. Hence, the output is 1.


package string.interview;

import java.util.HashSet;
import java.util.Scanner;

public class PanagramChecking {
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.nextLine();
		
		String lowerStr=str.toLowerCase();
		HashSet<Character> result=new HashSet<Character>();
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				result.add(ch);
			}
		}
		if(result.size()==26) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
