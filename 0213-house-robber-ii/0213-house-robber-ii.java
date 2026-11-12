class Solution {
     public int robI(int start,int end,int[] nums) {
        int n=end-start+1;
        int dp[]=new int[n+2];
        dp[0]=0;
        dp[n+1]=0;
        for(int i=n-1;i>=0;i--){
            dp[i]=Math.max(nums[i+start]+dp[i+2],dp[i+1]);
        }
        return dp[0];
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
       int one= robI(0,nums.length-2,nums);
       int two=robI(1,nums.length-1,nums);
       return Math.max(one,two);
    }
}