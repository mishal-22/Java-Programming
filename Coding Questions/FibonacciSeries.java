package codingQuestions;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number upto fibonacci series want!");
	int n=scanner.nextInt();
	fibonacciUsingIteration(n);
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.print(fibonacciUsingRecursion(i)+" ");
	}
}

private static int fibonacciUsingRecursion(int n) {
	// TODO Auto-generated method stub
	if(n<=1) {
		return n;
	}else {
		
	return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
	}
	
	
}

private static void fibonacciUsingIteration(int n) {
	// TODO Auto-generated method stub
	int num1=0;
	int num2=1;
	int num3;
	for(int i=0;i<n;i++) {
		System.out.print(num1+" ");
		num3=num1+num2;
		num1=num2;
		num2=num3;
	}
	
}
}
