class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> sb = new HashSet<>();
        int start=0;
        int end=0;
        int score=0;
        int maxScore=Integer.MIN_VALUE;
        while(end<nums.length){
          while(sb.contains(nums[end])){
             sb.remove(nums[start]);
             score-=nums[start];
             start++;
          }
            
            sb.add(nums[end]);
            score+=nums[end];
            end++;
            maxScore=Math.max(score,maxScore);   
        }
        return maxScore;
    }
}