package snippet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeating {
public static void main(String[] args) {
	String str="codefofrcode";
	System.out.println(nonRepeat(str));
}
public static int nonRepeat(String str) {
	char[] chars=str.toCharArray();
	Map<Character, Integer> map=new HashMap<>();
	for(char c:chars) {
		map.put(c,map.getOrDefault(c,0)+1);
	}
	for(int i=0;i<chars.length;i++) {
		char ch=chars[i];
		if(map.get(ch)==1) {
			return i;
		}
	}
	return -1;
}
}
