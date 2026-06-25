class Solution {
    public int longestSubarray(int[] nums) {
        int right=0;
        int left=0;
        int zeroCount=0;
        int maxLength=0;
        while(right<nums.length){
           if(nums[right]==0){
            zeroCount++;
          
           }
           while(zeroCount>1){
              if(nums[left]==0){
                zeroCount--;
              }
                left++;
           }
            right++; 
           maxLength= Math.max(maxLength,right-left-1);
        }
        return maxLength;
    }
}