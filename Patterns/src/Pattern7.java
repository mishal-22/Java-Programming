import java.util.Scanner;

public class Pattern7 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the charecter");
	char ch=scanner.next().charAt(0);
	for(int i=1;i<=5;i++) {
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

    *   1   1*2-1
   ***   3  2*2-1
  ***** 5   3*2-1
 *******7   4*2-1
*********9  5*2-1

*/

//@
//@@@
//@@@@@
//@@@@@@@
//@@@@@@@@@