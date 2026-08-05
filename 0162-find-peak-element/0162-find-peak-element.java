class Solution {
    public int findPeakElement(int[] nums) {
       
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]<nums[i+1]){
            continue;
          }
          else {
            return i;
          }
        }
        return nums.length-1;
    }
}