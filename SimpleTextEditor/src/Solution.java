import java.util.Scanner;
import java.util.Stack;

public class Solution {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Stack<String> history = new Stack<>();
	        String curr="";
	        int num = scan.nextInt();
	        for(int i=0;i<num;i++){
	            int operation = scan.nextInt();
	            switch (operation) {
				case 1:String s = scan.next();
					    history.push(curr);
					    curr = curr.concat(s);
					    break;
				case 2:int delete = scan.nextInt();
						history.push(curr);
						curr = curr.substring(0, curr.length()-delete);
						break;
				case 3:int k=scan.nextInt();
						System.out.println(curr.charAt(k-1));
						break;
				case 4:curr = history.pop();	
						break;
						
				}
	        }
}
}	 
