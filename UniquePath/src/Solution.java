import java.util.HashMap;

public class Solution {
	 HashMap<String,Integer> map = new HashMap<>();
	    public int uniquePaths(int m, int n) {
	        String s = m+","+n;
	        if(map.containsKey(s)){
	            return map.get(s);
	        }
	        int result;
	        if(m==0 || n==0) {
				return 0;
			}
			if(m==1 || n==1) {
				return 1;
			}
			result=uniquePaths(m-1,n)+uniquePaths(m, n-1);
	        map.put(s,result);
	        return result;
	    }
}
