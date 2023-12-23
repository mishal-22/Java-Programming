import java.util.Scanner;

public class PatternMISHAL {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the character");
	char ch=scanner.next().charAt(0);
	System.out.println("Enter the no.of rows and columns");
	int num=scanner.nextInt();
	for(int i=0;i<=num-1;i++) {
		for(int j=0;j<=num-1;j++) {
			if(j==0 || j==num-1 || (i==j && i<=num/2) || (i+j==num-1 && i<=num/2 )) {
				System.out.print(ch);
			
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		for(int j=0;j<=num;j++) {
			if(i==0 || i==num-1 || j==num/2) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
		for(int j=0;j<=num;j++) {
			if(i==0 || i==num-1 || (j==0 && i<=num/2) || i==num/2 || (j==num && i>num/2)) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		for(int j=0;j<=num;j++) {
			if(j==0 || i==num/2 || j==num) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		for(int j=0;j<=num;j++) {
			if(i==0 || j==0 || j==num || i==num/2) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		for(int j=0;j<=num;j++) {
			if(j==0 || i==num-1 ) {
				System.out.print(ch);
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
