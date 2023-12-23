import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scanner.next().charAt(0);
		for(int i=1;i<=5;i++) {
		  if(i==1 || i==5) {
			  for(int j=1;j<=5;j++) {
				  System.out.print(ch);
			  }
		  }
		  else {
			  for(int j=1;j<=5;j++) {
				  if(j==1 || j==5) {
					  System.out.print(ch);
				  }
				  else {
					System.out.print(" ");
				}
			  }
		  }
		 
		  System.out.println();
		}
	}
}
