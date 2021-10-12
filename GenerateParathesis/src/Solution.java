import java.util.ArrayList;
import java.util.List;

class Solution {
	    public List<String> generateParenthesis(int n) {
	        int open=n;
	        int close=n;
	        List<String> result = new ArrayList<>();
	        String output="";
	        solve(open,close,result,output);
	        return result;
	    }
	    public void solve(int open,int close,List<String> result,String output){
	        if(open==0 && close==0){
	            result.add(output);
	            return;
	        }
	        if(open!=0){
	            String newOutput=output.concat("(");
	            solve(open-1,close,result,newOutput);
	            
	        }
	        if(close>open){
	            String newOutput=output.concat(")");
	            solve(open,close-1,result,newOutput);     
	        }
	        return;
	        
	    }
	}

