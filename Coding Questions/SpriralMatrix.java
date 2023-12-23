package snippet;

public class SpriralMatrix {
public static void main(String[] args) {
	int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int row=arr.length;
	int col=arr[0].length;
	int k=0,l=0;
	while(k<row && l<col) {
		for(int i=l;i<=col-1;i++) {
			System.out.print(arr[k][i]+" ");
		}
		k++;
		for(int i=k;i<=row-1;i++) {
			System.out.print(arr[i][col-1]+" ");
		}
		col--;
		if(k<row) {
			for(int i=col-1;i>=l;i--) {
				System.out.print(arr[row-1][i]+" ");
			}
			row--;
			
		}
		
		if(l<col) {
			for(int i=row-1;i>=k;i--) {
				System.out.print(arr[i][l]+" ");
			}
			l++;
		}
		
	}
}
}
