package snippet;

// Capitalize each word that start with lower case
public class CapitalizeEachWord {
public static void main(String[] args) {
	String string="I am learning java";
	capitalize(string);
}
public static void capitalize(String str) {
	String[] arr=str.split(" ");
	for(int i=0;i<arr.length;i++) {
		if(arr[i].charAt(0)>='a'&& arr[i].charAt(0)<='z') {
			char current=arr[i].charAt(0);
			char currentCapital=(char)(current-32);
			arr[i]=currentCapital+arr[i].substring(1);
		}
	}
	String string=String.join(" ", arr);
	System.out.println(string);
//    for(String s:arr) {
//    	System.out.print(s+" ");
//    }
}
}
