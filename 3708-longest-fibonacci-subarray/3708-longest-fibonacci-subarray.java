class Solution {
    public int longestSubarray(int[] nums) {
        int min=2;
        int longest=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+nums[i-2])){
                min++;
            }
            else{
                min=2;
            }
        longest=Math.max(min,longest);
        }
        return longest;
    }
}