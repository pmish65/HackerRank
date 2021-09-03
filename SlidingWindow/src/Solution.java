import java.util.List;

public class Solution {
	public static int slidingWindow(List<Integer> list,int k) {
		int max=0,start=0,end=0,sum=0;
		while(end<list.size()) {
			sum+=list.get(end);
			if((end-start+1)==k) {
				if(max<sum) {
					max=sum;
				}
				sum=sum-list.get(start);
				start++;
				end++;
			}
			end++;
		}
		return max;
	}
	
}
