class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int maxsum=0;
        int start=0;
        int end=0;
    
       while(end<nums.length-1){
        if(nums[end]<nums[end+1]){
             sum+=nums[end];
        }
       else{
         sum+=nums[end];
         maxsum=Math.max(sum,maxsum);
         sum=0;
       } 
       end++;
       }
        
         sum+=nums[end];
         maxsum=Math.max(sum,maxsum);
        return maxsum;
    }
}