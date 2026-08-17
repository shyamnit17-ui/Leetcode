class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=-1;
      while(i<j){
        int mid=i+(j-i)/2;
        if(mid<nums.length&&mid%2==0){
            if(nums[mid]!=nums[mid+1]){
                j=mid;
            }
            else{
                i=mid+2;
            }
        }
        else{
            if(nums[mid]==nums[mid-1]){
                i=mid+1;
            }
            else{
                 j=mid;
            }
        }
      
      }
      return nums[i];
    }
}