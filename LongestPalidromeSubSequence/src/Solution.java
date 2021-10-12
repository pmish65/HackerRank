
public class Solution {
	 public int longestPalindromeSubseq(String s) {
	        StringBuilder sb = new StringBuilder(s);
	        sb.reverse();
	        return LPS(s,sb.toString(),s.length(),sb.length());
	        
	    }
	    public int LPS(String x,String y,int m,int n){
	        if(m==1 && n==1){
	            return 1;
	        }
	        if(x.charAt(m-1)==y.charAt(n-1)){
	           return 1+LPS(x,y,m-1,n-1);
	        }
	        else{
	            return (1+LPS(x,y,m-1,n))>(1+LPS(x,y,m,n-1))?(1+LPS(x,y,m-1,n)):(1+LPS(x,y,m,n-1)); 
	        }
	    }
	    
}
