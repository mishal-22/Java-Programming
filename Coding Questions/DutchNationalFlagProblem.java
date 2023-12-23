package snippet;

public class DutchNationalFlagProblem {
public static void main(String[] args) {
	int[] arr= {1,1,0,2,1,0,0,2,2,0,1};
	DutchNationalFlagProblem d=new DutchNationalFlagProblem();
	d.threeSort(arr);
	d.print(arr);
	
	
}
public void print(int[] arr) {
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
public void threeSort(int[] arr) {
	int i=0;
	int j=0;
	int k=arr.length-1;
	while(i<=k) {
		if(arr[i]==0) {
			swap(arr,i,j);
			i++;
			j++;
		}
		else if(arr[i]==1) {
			i++;
		}
		else if(arr[i]==2) {
			swap(arr, i, k);
			k--;
		}
	}
}
public static void swap(int[] arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
