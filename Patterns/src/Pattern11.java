import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scanner.next().charAt(0);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
