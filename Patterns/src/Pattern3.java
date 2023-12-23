import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the charecter");
		char ch=scanner.next().charAt(0);
		for(int i=1;i<=5;i++) {
			System.out.println(ch+" ");
		}
	}
}
