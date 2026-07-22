class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;  
        int pos=Integer.MAX_VALUE;
        if(target<nums[0]){
            return 0;
        }
        while(i<=j){
        int mid=j-((j-i)/2);
        if(nums[mid]==target){
           return mid;
        }
        else if(nums[mid]>target){
             j=mid-1;
             pos=i;
        }
        else if(nums[mid]<target){
            i=mid+1;
            pos=i;
        }  
        }
        return pos;
    }
}