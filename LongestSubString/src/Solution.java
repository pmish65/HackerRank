import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
        Queue<String> queue = new LinkedList<>();
        
        int max=0;
       
        int curr=0;
        int size=s.length();
        while(curr<size){
            if(!queue.contains(String.valueOf(s.charAt(curr)))) {
            	queue.add(String.valueOf(s.charAt(curr)));
            	
            	
            }
            else {
            	while(queue.contains(String.valueOf(s.charAt(curr)))) {
            	queue.poll();
            	}
            	
            	queue.add(String.valueOf(s.charAt(curr)));
            	
            	
            }
            if(queue.size()>max) {
        		max=queue.size();
        	}
            	
            curr++;
        }
        return max;
        
    }
}
