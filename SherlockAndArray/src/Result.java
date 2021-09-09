import java.util.List;

public class Result {
	 public static String balancedSums(List<Integer> arr) {
	       int total = arr.stream().reduce(0,(a,b)->a+b);
	       String result="NO";
	       int sum=0;
	       for(int ele:arr) {
	    	   sum+=ele;
	    	   if(sum-ele==total-sum) {
	    		   return "YES";
	    	   }
	       }
	       return result;
	    }
	   
}
