
public class Pattern20 {
public static void main(String[] args) {
	int num=16;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(num<=9) {
				System.out.print("0"+num+" ");
				num--;
				
			}
			else {
				System.out.print(num+" ");
				num--;
			}
		}
		System.out.println();
	}
}
}
