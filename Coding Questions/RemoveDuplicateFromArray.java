package snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,1,2,3,4,5,3,4,5};
	List<Integer> listWithDuplicate=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++) {
		listWithDuplicate.add(arr[i]);
	}
	List<Integer> unique=new ArrayList<Integer>();
	for(Integer u:listWithDuplicate) {
		if(!unique.contains(u)) {
			unique.add(u);
		}
	}
	System.out.println(unique);
}
}
