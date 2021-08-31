import java.util.Stack;

public class Solution {
	public static String isBalanced(String s) {
        Stack<String> stack = new Stack<>();
        int size = s.length();
        for(int i=0;i<size;i++) {
        	if(stack.isEmpty()) {
        		stack.push(String.valueOf(s.charAt(i)));
        	}
        	else if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
        		stack.push(String.valueOf(s.charAt(i)));
        	}
        	else {
        		if(s.charAt(i)==')') {
        			if(stack.peek().equals("(")) {
        				stack.pop();
        			}
        			else {
        				stack.push(String.valueOf(s.charAt(i)));
        			}
        		}
        		else if(s.charAt(i)=='}') {
        			if(stack.peek().equals("{")) {
        				stack.pop();
        			}
        			else {
        				stack.push(String.valueOf(s.charAt(i)));
        			}
        		}
        		else {
        			if(stack.peek().equals("[")) {
        				stack.pop();
        			}
        			else {
        				stack.push(String.valueOf(s.charAt(i)));
        			}
        		}
        		
        	}
        	
        }
        if(stack.isEmpty()) {
        	return "Yes";
        }
        else {
        	return "No";
        }

    }
}
