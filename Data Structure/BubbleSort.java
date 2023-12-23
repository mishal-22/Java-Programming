package dataStructure.learn;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int[] arr=new int[scanner.nextInt()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	System.out.println("Before sorting....");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<=arr.length-2;i++) {
		for(int j=0;j<=arr.length-2-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("BeforAfter  sorting....");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	scanner.close();
}
}
