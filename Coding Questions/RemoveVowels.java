package snippet;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {
public static void main(String[] args) {
	String string="What is your name?";
	System.out.println(removeVowels(string));
}
public static String removeVowels(String str) {
	Set<Character> vowels=Set.of('a','e','i','o','u');
	char[] arr=str.toCharArray();
	StringBuilder sb=new StringBuilder();
	for(char c:arr) {
		if(!vowels.contains(c)) {
			sb.append(c);
		}
	}
	return sb.toString();
}
}
