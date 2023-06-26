package edu.igo.stack;

import java.util.Stack;

public class BalancedParenthesisStack {

	public static void main(String[] args) {
		System.out.println(isBalanced("{()}"));
	}
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '{'||c == '('||c =='[' ) 
				stack.push(c);
			else if(c == '}'||c == ')'||c ==']') {
				if(stack.isEmpty())
					return false;
				char top = stack.pop();
				if(!((top == '{' && c == '}') || (top == '(' && c == ')') || (top == '[' && c == ']')))
					return false;
			}
		}
		return stack.isEmpty();
	}
}
