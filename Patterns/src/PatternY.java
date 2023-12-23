import java.util.Scanner;

public class PatternY {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of row and columns");
		int n=scanner.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if((i<=n/2 && j<=n/2 &&j==i) ||(j>=n/2 && i<=n/2 && j+i==n-1)|| (j==n/2 && i>=n/2)  ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
