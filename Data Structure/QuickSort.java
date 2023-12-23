
public class QuickSort {
public static void main(String[] args) {
	int[] arr= {2,4,9,1,3,10,6};
	QuickSort quickSort=new QuickSort();
	quickSort.sort(arr, 0, arr.length-1);
	quickSort.print(arr);
}
public int partiotion(int[] arr,int low,int high) {
	int pivot=arr[high];                       // taking last element as the pivot point 
	int i=0,j=0;                         // initializing 2 pointers i,j 
	while(i<=high) {                      // traversing through each element in the array
		if(arr[i]<=pivot) {                   // element pointed by is less than pivot then swap ith element with jth element.
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;                           //incrementing j pointer to next element(j point to the large element in left side)
		}
		i++;                               // incrementing i pointer to next element
	}
	return j-1;                         //returning pivot point.
}
public void sort(int[] arr,int low,int high) {               //actual sorting by recursing left sub arrays and right sub arrays
	if(low<high) {
		int p=partiotion(arr, low, high);              //calling the method partitioning()
		sort(arr, low, p-1);                 //recursively sorting left sub array
		sort(arr, p+1, high);                 // recursively sorting right sub array
	}
}
public void print(int[] arr) {
	for(int num:arr) {
		System.out.print(num+" ");
	}
}
}
