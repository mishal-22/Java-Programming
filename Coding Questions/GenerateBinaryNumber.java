package snippet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scanner.nextInt();
	String[] result=new String[n];
	Queue<String> queue=new LinkedList<String>();
	queue.offer("1");
	for(int i=0;i<n;i++) {
		result[i]=queue.poll();
		String s1=result[i]+"0";
		String s2=result[i]+"1";
		queue.offer(s1);
		queue.offer(s2);
	}
	for(String s:result) {
		System.out.print(s+" ");
	}
}
}
