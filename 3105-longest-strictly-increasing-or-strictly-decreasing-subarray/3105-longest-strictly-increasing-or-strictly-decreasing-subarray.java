class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ct1=1;
        int ct2=1;
        int j=1;
        int counter1=1;
        int counter2=1;

        for(int i=0;i<nums.length-1;i++){
          if(nums[i]<nums[j]){
            counter1++;
            counter2=1;
          }
          else if(nums[i]>nums[j]){
            counter2++;
            counter1=1;
          }
          else if(nums[i]==nums[j]){
            counter1=1;
            counter2=1;
          }
          ct1=Math.max(ct1,counter1);
          ct2=Math.max(ct2,counter2);
          j++;
        }
        return Math.max(ct1,ct2);
    }
}