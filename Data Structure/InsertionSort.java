package dataStructure.learn;

import java.util.Scanner;

public class InsertionSort {
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
	
	for(int i=1;i<=arr.length-1;i++) {
		int current=arr[i];
		int previous=i-1;
		while(previous>=0 && arr[previous]>current) {
			arr[previous+1]=arr[previous];
			previous--;
		}
		arr[previous+1]=current;
		
	}
	System.out.println("Array After sorting");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.println();
}
}
