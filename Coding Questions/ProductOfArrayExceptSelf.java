package snippet;

public class ProductOfArrayExceptSelf {
public static void main(String[] args) {
	int[] arr= {1,2,3,4};    //{1,1,2,6}  {8,8,8,6}
	int[] result=product(arr);
	for(int i:result) {
		System.out.print(i+" ");
	}
}
public static int[] product(int[] arr) {
	int[] result=new int[arr.length];
	int temp=1;
	for(int i=0;i<arr.length;i++) {
		result[i]=temp;
		temp=temp*arr[i];
	}
	temp=1;
	for(int i=arr.length-1;i>=0;i--) {
		result[i]=temp*result[i];
		temp=temp*arr[i];
	}
	return result;
}
}
