
public class Solution {
	 public boolean canPartitionKSubsets(int[] nums, int k) {
		 int sum=0;
		 for(int ele : nums) {
		 		sum=ele+sum;
		 	}
		 if(k==0 || sum%k!=0) {
			 return false;
		 }
		 int target = sum/k;
	        return canPartitionKSubsetsHelper(nums,new boolean[nums.length] ,target, 0, 0, k);
	    }
	 public boolean canPartitionKSubsetsHelper(int[] arr,boolean[] visited,
			 int target,int ongoing,int start,int k ) {
		 if(k==1) {
			 return true;
		 }
		 if(ongoing==target) {
			 return canPartitionKSubsetsHelper(arr, visited, target, 0, 0, k-1);
		 }
		 if(ongoing>target) {
			 return false;
		 }
	
			 for(int i=start;i<arr.length;i++) {
				 if(visited[i]==false) {
					 visited[i]=true;
					 if(canPartitionKSubsetsHelper(arr, visited, target, ongoing+arr[i], i+1, k))
					 {
						return true;
					 }
					visited[i]=false;
				 }
				
			 }
		 
		 
		 return false;
	 }
}
