package snippet;

public class SquaresofSortedArray {
public static void main(String[] args) {
	int arr[]= {-4,-1,0,3,5,7};
	int[] result=squareSort(arr);
	for(int num: result) {
		System.out.print(num+" ");
	}
	
}
public static int[] squareSort(int[] arr) {
	int i=0;
	int j=arr.length-1;
	int[] result=new int[arr.length];
	for(int k=arr.length-1;k>=0;k--) {
		if(Math.abs(arr[i])>Math.abs(arr[j])) {
			result[k]=arr[i]*arr[i];
			i++;
		}
		else {
			result[k]=arr[j]*arr[j];
			j--;
		}
	}
	return result;
}
}
