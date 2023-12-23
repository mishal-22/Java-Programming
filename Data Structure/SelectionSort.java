package dataStructure.learn;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int[] arr=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	System.out.println("Array before sorting");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	
	for(int i=0;i<=arr.length-2;i++) {
		int minimum=arr[i];
		int pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[j]<minimum) {
				minimum=arr[j];
				pos=j;
			}
		}
		int temp=arr[i];
		arr[i]=minimum;
		arr[pos]=temp;
		
	}
	System.out.println("Array After sorting");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	
}
}
