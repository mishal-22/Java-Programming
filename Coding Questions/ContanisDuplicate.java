package snippet;

import java.util.HashSet;
import java.util.Set;

public class ContanisDuplicate {
public static void main(String[] args) {
	int[] arr= {1,5,8,2,4,9};
	System.out.println(containsDuplicate(arr));
}

public static boolean containsDuplicate(int[] arr) {
	Set<Integer> set=new HashSet<>();
	for(int i=0;i<arr.length;i++) {
		if(set.contains(arr[i])) {
			return true;
		}
		set.add(arr[i]);
	}
	return false;
	
}
}
