class Solution {
    public int maxScore(int[] nums, int k) {
        int si = 0;
        int ei = nums.length-1;
        int score = 0;
        int maxscore = Integer.MIN_VALUE;
        int count = 1;
        for (int i = si; i <k; i++) {
            score += nums[i];
        }
        maxscore = Math.max(score, maxscore);
        if(k==nums.length){
            return maxscore;
        }
        while (count<=k) {
            score = score - nums[k-count];
            si++;
            score = score + nums[ei]; 
            ei--;
            maxscore = Math.max(score, maxscore);
            count++;
        }
        return maxscore;
    }
}