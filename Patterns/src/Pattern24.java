
public class Pattern24 {
public static void main(String[] args) {
	int num1=1,num2=2;
	for(int i=1;i<=4;i++) {
		if(i==2 && i==4) {
			for(int j=1;j<=4;j++) {
				if(num1<=9) {
					System.out.print("0"+num1+" ");
					num1+=2;
				}
				else {
					System.out.print(num1+" ");
					num1+=2;
				}
			}
		}
		else {
			for(int j=1;j<=4;j++) {
				if(num2<=9) {
					System.out.print("0"+num2+" ");
					num2+=2;
				}
				else {
					System.out.print(num2+" ");
					num2+=2;
				}
			}
		}
		System.out.println();
	}
}
}
