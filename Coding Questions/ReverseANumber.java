package snippet;

public class ReverseANumber {
public static void main(String[] args) {
	System.out.println(reverse(-21234));
	
}
public static int reverse(int num) {
	boolean isNegative=num<0;
	if(isNegative) {
		num=num*-1;
		
	}
	int revers=0;
	int rem;
	while(num>0) {
		rem=num%10;
		revers=revers*10+rem;
		num=num/10;
	}
	return isNegative?revers*-1:revers;
}
}
