import java.util.Scanner;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Solution s = new Solution();
       int num = scan.nextInt();
       for(int i=0;i<num;i++){
           int choice=scan.nextInt();
           switch(choice){
               case 1:int x = scan.nextInt();
                      s.enqueue(x);
                      break;
               case 2:s.dequeue();
                      break;
               case 3:s.showFront();
                      break;
           }
       }
       scan.close();
    }
    public  void enqueue(int x) {
        
        stack1.push(x);
    }
    public void dequeue() {
        if(stack2.empty()){
                    while(!stack1.empty()){
                        stack2.push(stack1.pop());
                    }
                }
                stack2.pop();
    }
    public void showFront() {
        if(stack2.empty()){
                    while(!stack1.empty()){
                        stack2.push(stack1.pop());
                    }
                }
                System.out.println(stack2.peek());
    }
}
