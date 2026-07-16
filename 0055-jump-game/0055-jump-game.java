class Solution {
    public boolean canJump(int[] nums) {
     int currentfarthestreach=0;
       for(int i=0;i<nums.length;i++){
       if(i>currentfarthestreach){
            return false;
        }   
         if(nums[i]+i>currentfarthestreach){
           currentfarthestreach=nums[i]+i;
        }
       
        }
        return true;
    }
}