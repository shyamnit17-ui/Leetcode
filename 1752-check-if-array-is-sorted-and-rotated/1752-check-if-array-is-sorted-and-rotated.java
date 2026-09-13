class Solution {
    public boolean check(int[] nums) {
       int m=0;
       for(int i=1;i<nums.length;i++){
         if(nums[i]>=nums[i-1]){
            continue;
         }
         else{
            m=i;
            break;
         }
       }
      
       for(int j=m+1;j<nums.length;j++){
         if(nums[j]>=nums[j-1]){
            continue;
         }
         else{
            return false;
         }
       }
        if(m>0){
         if(nums[nums.length-1]>nums[0]){
            return false;
         }
       }
       return true;
    }
}