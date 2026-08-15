class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
           ans^=nums[i];
           }
           if(ans==0&&count==nums.length){
            return ans;
           }
        if(ans==0){
            return nums.length-1;
        }
        return nums.length;
    }
}