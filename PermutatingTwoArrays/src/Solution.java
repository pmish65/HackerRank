import java.util.Collections;
import java.util.List;

public class Solution {
	 public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	        int i=0,j=0;
	        Collections.sort(A);
	        Collections.sort(B,Collections.reverseOrder());
	        while(!A.isEmpty() && i<A.size()){
	            if(A.get(i)+B.get(j)>=k){
	                A.remove(i);
	                B.remove(j);
	                i=0;
	            }
	            else {
	            i++;
	            }
	        }
	        if(A.isEmpty()) {
	        	return "YES";
	        }
	        else {
	        	return "NO";
	        }

	    }
}
