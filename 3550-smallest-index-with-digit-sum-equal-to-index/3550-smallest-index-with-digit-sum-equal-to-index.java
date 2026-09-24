class Solution {
    public int smallestIndex(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int digsum=0;
            while(curr>0){
                digsum+=curr%10;
                curr/=10;
            }
            if(digsum==i){
                ans=Math.min(ans,i);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}