
public class Pattern23 {
public static void main(String[] args) {
	int num=1;
	for(int i=1;i<=4;i++) {
		if(i%2!=0) {
		for(int j=1;j<=4;j++) {
			
				System.out.print(num+" ");
				num++;
			}
		num+=3;
		}
			
			else {
				for(int j=1;j<=4;j++) {
				
				System.out.print(num+" ");
				num--;
			}
				num+=5;
			}
		System.out.println();
		}
		
	}
}

