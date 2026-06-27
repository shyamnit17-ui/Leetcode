class Solution {
    
    public int[] sortedSquares(int[] nums) {
       
       int result[]=new int[nums.length];
       int start=0;
       int end=nums.length-1;
       int write=nums.length-1;
       while(start<=end){
         if(Math.abs(nums[end])>Math.abs(nums[start])){
            result[write]=nums[end]*nums[end];
            end--;
            write--;
         }
         else{
            result[write]=nums[start]*nums[start];
            start++;
            write--;
         }
       }  
        return result;
    }
}