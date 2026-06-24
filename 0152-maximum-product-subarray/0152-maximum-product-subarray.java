class Solution {
    public int maxProduct(int[] nums) {
        int currMax=Integer.MIN_VALUE;
        int currMin=Integer.MAX_VALUE;
        int prevMax=nums[0];
        int prevMin=nums[0];
        int ans=nums[0];
        for(int i= 1; i< nums.length; i++){
         int oldMax = prevMax;
         int oldMin = prevMin;  
          currMax=Math.max(nums[i], Math.max(nums[i]*oldMax,nums[i]*oldMin));
          currMin = Math.min(nums[i], Math.min(nums[i]*oldMax,nums[i]*oldMin));
          prevMax = currMax;
          prevMin = currMin;
         ans=Math.max(ans,currMax);
        }   
        return ans;
    }
}