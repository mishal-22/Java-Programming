package snippet;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 2,4,3,7,1,8,9,0};
		System.out.println("enter the target");

		int target = scanner.nextInt();
		threeSum(arr, target);

	}

public static void threeSum(int[]arr,int target) {
	Arrays.sort(arr);
	for(int i=0;i<arr.length-2;i++) {
		int j=i+1;
		int k=arr.length-1;
		while(j<k) {
			int sum=arr[i]+arr[j]+arr[k];
			if(sum==target) {
				System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				j++;
				k--;
			}else if(sum<target) {
				j++;
			}
			else {
				k--;
			}
		}
	}
}
}
