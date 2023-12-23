package snippet;

public class IsSubsequence {
public static void main(String[] args) {
	String string="abcde";
	String subsequence="acee";
	int i=0,j=0;
	while(i<string.length()&& j<subsequence.length()) {
		if(string.charAt(i)==subsequence.charAt(j)) {
			j++;
		}
		i++;
	}
	if(j==subsequence.length()) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
