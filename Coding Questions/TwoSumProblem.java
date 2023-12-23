package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumProblem {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int[] arr= {1,3,4,7,9,11};
	System.out.println("enter the target");
	
	int target=scanner.nextInt();
	int[] reuslt=twoSum(arr,target);
	for(int i:reuslt) {
		System.out.print(i+" ");
	}
}

public static int[] twoSum(int[] arr, int target) {
	int[] result=new int[2];
	Map<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(!map.containsKey(target-arr[i])) {
			map.put(arr[i],i);
		}
		else {
		result[1]=i;
		result[0]=map.get(target-arr[i]);
		return result;
		}
		
	}
	throw new IllegalArgumentException("Two number not found");
}
}
