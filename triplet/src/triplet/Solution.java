package triplet;


	class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	        int min=Integer.MAX_VALUE;
	        
	        int sum=0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                for(int k=j+1;k<nums.length;k++){
	                    sum=nums[i]+nums[j]+nums[k];
	                    if(Math.abs(target-sum)<min){
	                        min=sum;
	                    }
	                }
	            }
	        }
	        return min;
	    }
	}

