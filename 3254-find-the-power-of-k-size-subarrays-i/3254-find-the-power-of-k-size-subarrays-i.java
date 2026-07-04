class Solution {
    
    public int[] resultsArray(int[] nums, int k) {
        int trueCount=0;
        int start=0;
        int end=k;
        int ans[]=new int[nums.length-k+1];
        //first window
        for(int i=0;i<end-1;i++){
            if(nums[i+1]==nums[i]+1){
                trueCount++;
            }
        }
      if(trueCount==k-1){
        ans[0]=nums[end-1];
      }
      else{
        ans[0]=-1;
      }
    //checking other windows
    while(end<nums.length){
        if(nums[start+1]==nums[start]+1){
            trueCount--;
        }
        start++;
        if(nums[end]==nums[end-1]+1){
            trueCount++;
        }
        if(trueCount==k-1){
            ans[end-k+1]=nums[end];
        }
        else{
            ans[end-k+1]=-1;
        }
        end++;
    }
    return ans;
    }
}