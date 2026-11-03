class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
         for(int i=0;i<nums.length;i++){
            count+=Math.abs(nums[i]-max);
        }
        return count;
    }
}