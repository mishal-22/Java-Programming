package snippet;

import java.util.Scanner;

public class SearchInsertPositionInSortedArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int[] arr= {1,3,5,7};
	int target=scanner.nextInt();
	search(arr, target);
	
}
public static void search(int[] arr,int target) {
	int start=0;
	int end=arr.length-1;
	int mid=(start+end)/2;
	while(start<end) {
		
		if(target==arr[mid]) {
			System.out.println(mid+1);
			return;
		}
		else if(target<arr[mid]) {
			end=mid-1;
			mid=(start+end)/2;
		}
		else if(target>arr[mid]) {
			start=mid+1;
			mid=(start+end)/2;
		}
	}
	System.out.println(mid+1);
}
}
