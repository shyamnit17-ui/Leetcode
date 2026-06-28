class Solution {
    public long maxSum(int[] nums, int k, int mul) {
       Arrays.sort(nums);
       int count=0;
        long sum=0;
       
        if(nums.length==1){
            sum=Math.max(nums[0],(long)nums[0]*mul);
            
            return sum;
        }
        for(int i=nums.length-1; i>=0 ; i--){
         if(count<k){
            int element=nums[i];   
            sum+=Math.max(element,(long)element*mul);
               mul--;
               count++;
         }
           
        }
        return sum;
    }
}