class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int bestlength = Integer.MAX_VALUE;
        while (end < nums.length) {  
            sum+=nums[end];
            end++;
            while (sum>=target){
            bestlength=Math.min(bestlength,end-start);  
            sum-=nums[start];
            start++;
            //  bestlength=Math.min(bestlength,end-start);  
           }
           
          
          
           
          }        
         if(bestlength!=Integer.MAX_VALUE){
            return bestlength;
         }
        return 0;
    }
}