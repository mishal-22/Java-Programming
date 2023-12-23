package com.supai;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccuranceString {
public static void main(String[] args) {
	HashMap<String, Integer> map=new HashMap<>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the line");
	String string=scanner.nextLine();
	String[] str=string.split("\\s");
	for(String s:str) {
		map.put(s, map.getOrDefault(s, 0)+1);
	}
	System.out.println(map);
}
}
