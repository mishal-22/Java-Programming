//Given a string, eliminate all “b” and “ac” in the string, replace them in-place and iterate over the string once.
//
//Example 1:
//
//Input: str = "aacbacc"
//Output: ac
//Explanation: Iterate once and remove
//occurrence of "b" and "ac"

//  aca
package string.interview;

import java.util.Scanner;

public class RemoveAandAC {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.nextLine();
		String string="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='b') {
				continue;
			}
		 if(str.charAt(i)=='a') {
			 
				if(i+1<str.length() && str.charAt(i+1)=='c' ) {
					i++;
					continue;
				}
			}
		
		string+=str.charAt(i);
	
		}
		System.out.println(string);
	}

}
