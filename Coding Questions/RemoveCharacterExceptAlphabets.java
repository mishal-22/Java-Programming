package snippet;

import java.util.Scanner;

public class RemoveCharacterExceptAlphabets {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();
	str=str.replaceAll("[^a-zA-Z]","");
	System.out.println(str);
}
}
