class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        int removedsum=x;
        for(int num:nums){
            totalsum+=num;
        }    
        if(totalsum<x){
            return -1;
        }
        else if(totalsum==x){
           return nums.length;
        }
     int targetsum=totalsum-removedsum;
     int start=0;
     int end=0;
     int subArraysum=0;
     int maxlength=0;
     while(end<nums.length){
       subArraysum+=nums[end];
       while(subArraysum>targetsum){
           subArraysum-=nums[start];
            start++;
        }
       
     if(subArraysum==targetsum){
            maxlength=Math.max(maxlength,end-start+1);
        }  
            end++; 
     }
     if(maxlength==0){
        return -1;
     }
     int minops=nums.length-maxlength;
     return minops;
    }
}