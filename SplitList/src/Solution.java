
public class Solution {
	 public ListNode[] splitListToParts(ListNode head, int k) {
	        ListNode curr = head;
	        double size=0;
	        while(curr!=null){
	            size++;
	            curr=curr.next;
	        }
	        curr=head;
	        ListNode[] list = new ListNode[k];
	        int pattern  =((int) Math.ceil(size/((float)k)));
	        if(pattern==0){
	            pattern=1;
	        }
	        System.out.println(pattern);
	        int count=0;
	        ListNode prev = null;
	        int i=0;
	        int z=0;
	        while(curr!=null){
	            if(count==0){
	                ListNode newNode = curr;
	                prev=curr;
	                list[i]=newNode;
	                System.out.println(curr.val);
	                curr = curr.next;
	                i++;
	                count++;
	               
	            }
	            else if(count==pattern){
	            	System.out.println(curr.val);
	                prev.next=null;
	                count=0;
	                z++;
	                int y=k-z;
	                size = size-pattern;
	                 pattern  =((int) Math.ceil(size/((float)y)));
	                
	            }
	            else{
	            	System.out.println(curr.val);
	                prev=curr;
	                curr=curr.next;
	                count++;
	            }
	        }
	      
	        return list;
	        
	    }
}
