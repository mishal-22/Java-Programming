import java.util.Scanner;

public class PatternA {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no.of rows");
		int row=scanner.nextInt();
		System.out.println("enter the no of columns");
		int col=scanner.nextInt();
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=col-1;j++) {
				if(i==0 || j==0 || j==col-1 || i==row/2) {
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
