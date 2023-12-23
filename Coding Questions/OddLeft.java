package snippet;

public class OddLeft {
public static void main(String[] args) {
	int[] arr= {1,5,2,7,3,4};
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0 && arr[j]%2==0) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		if(arr[j]%2!=0) {
			j++;
		}
	}
	for(int a:arr) {
		System.out.print(a+" ");
	}
}
}
