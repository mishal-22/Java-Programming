package snippet;

import java.util.Scanner;

public class CaeserCiphar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string ");
	String string=scanner.next();
	System.out.println("Enter the shift ");
	int shift=scanner.nextInt();
	decrypt(string, shift);
	
}
public static void caeser(String string,int shift) {
//	string.toLowerCase();
	StringBuilder encrypted=new StringBuilder();
	for(int i=0;i<string.length();i++) {
		char current=string.charAt(i);
		char encryptedChar= (char)((current+shift-'a')%26+'a');
		encrypted.append(encryptedChar);
		
	}
	System.out.println(encrypted.toString());
}
public static void decrypt(String string,int shift) {
	StringBuilder decrypted=new StringBuilder();
	for(int i=0;i<string.length();i++) {
		char current=string.charAt(i);
		char decryptedChar= (char)((current-shift-'a')%26+'a');
		decrypted.append(decryptedChar);
		
	}
	System.out.println(decrypted.toString());
}
}
