
public class Pattern21 {
public static void main(String[] args) {
	int num=2;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			if(num<10) {
				System.out.print("0"+num+" ");
				num+=2;
			}
			else {
				System.out.print(num+" ");
				num+=2;
			}
		}
		System.out.println();
	}
}
}
