import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the charecter");
		char ch=scanner.next().charAt(0);
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}


//@ 
//@ @ 
//@ @ @ 
//@ @ @ @ 
//@ @ @ @ @ 