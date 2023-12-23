package snippet;

public class SortMaxMin {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	int[] result=sortMaxMin(arr);
	for(int i:result) {
		System.out.print(i+" ");
	}
	
}
public static int[] sortMaxMin(int[] arr) {
	int maxIdx=arr.length-1;
	int minIdx=0;
	int max=arr[maxIdx]+1;
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			arr[i]=arr[i]+(arr[maxIdx]%max)*max;
			maxIdx--;
		}
		else {
			arr[i]=arr[i]+(arr[minIdx]%max)*max;
			minIdx++;
		}
	}
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]/max;
	}
	return arr;
}
}
