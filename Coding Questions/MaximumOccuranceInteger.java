package com.supai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccuranceInteger {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	HashMap<Integer, Integer> map=new HashMap<>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	while(scanner.hasNextInt()) {
		al.add(scanner.nextInt());
	}
	for(int a:al) {
		map.put(a, map.getOrDefault(a, 0)+1);
	}
	System.out.println(map);
}
}


