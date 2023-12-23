package snippet;

import java.util.Stack;

public class ParanthesisProblem {
// intput="{()}"       output=true
//	input="{()"         output=false
	
	public static void main(String[] args) {
		String s1="{()}";
		Stack<Character> stack=new Stack<Character>();
		char[] chars=s1.toCharArray();
		for(char c:chars) {
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("false");
					return;
				}
				else {
					char top=stack.peek();
					if((c==')'&&top=='(')||(c=='}'&& top=='{')||(c==']'&&top=='[')) {
						stack.pop();
					}
					else {
						System.out.println("false");
						return;
					}
				}
			}
		}
		System.out.println(stack.isEmpty());
	}
}
