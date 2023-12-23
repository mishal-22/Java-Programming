import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the charecter");
		char ch=scanner.next().charAt(0);
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}


/*

*********  9   (i*2)-1
 *******   7
  *****    5
   ***     3
    *      1
*/