// 1 3 2 4
// Two sum problem
package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MutalFundTarget {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scanner.nextInt();
	int[] arr=new int[size];

	System.out.println("enter the items");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
		
	}
	System.out.println("enter the target");
	int target=scanner.nextInt();
	int[] result=TwoSum(arr,target);
	for(int i:result) {
		System.out.print(i+" ");
	}
}

   public static int[] TwoSum(int[] arr, int target) {
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
	int[] result=new int[2];
	for(int i=0;i<arr.length;i++) {
		if(!map.containsKey(target-arr[i])) {
			map.put(arr[i], i);
		}
		else {
			result[1]=i;
			result[0]=map.get(target-arr[i]);
			return result;
		}
		
	}
	throw new IllegalArgumentException("Sum is not found");
	
}
}
