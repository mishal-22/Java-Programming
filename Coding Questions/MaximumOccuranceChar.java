package com.supai;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccuranceChar {
public static void main(String[] args) {
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the word");
	String string=scanner.next();
	for(int i=0;i<string.length();i++) {
		map.put(string.charAt(i),map.getOrDefault(string.charAt(i), 0)+1);
	}
	System.out.println(map);
	
}
}
