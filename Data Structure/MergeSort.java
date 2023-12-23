
public class MergeSort {
public static void main(String[] args) {
	int[] arr= {9,3,5,6,2,1,0,2};
	MergeSort ms=new MergeSort();
	ms.sort(arr, new int[arr.length],0, arr.length-1);
	ms.printArray(arr);

}
public void printArray(int[] arr) {
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
public  void sort(int[] arr,int[] temp,int low,int high) {
	if(low<high) {
		int mid=low+(high-low)/2;
		sort(arr, temp, low, mid);
		sort(arr, temp, mid+1, high);
		merge(arr, temp, low, high, mid);
		
	}
	
}
public void merge(int[] arr,int[] temp,int low,int high,int mid) {
	for(int i=low;i<=high;i++) {
		temp[i]=arr[i];
	}
	int i=low;int j=mid+1;int k=low;
	while(i<=mid&&j<=high) {
		if(temp[i]<=temp[j]) {
			arr[k]=temp[i];
			i++;
		}
		else {
			arr[k]=temp[j];
			j++;
		}
		k++;
	}
	while(i<=mid) {
		arr[k]=temp[i];
		i++;
		k++;
	}
	
	
}
}
