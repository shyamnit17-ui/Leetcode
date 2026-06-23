class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int difference=Integer.MAX_VALUE;
        int bestsum=0;
      for(int i=0;i<nums.length;i++){
        
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            sum=nums[i]+nums[j]+nums[k];
            if(sum<target){
                j++;
            }
            else if(sum>target){
                k--;
            }
            else {
                return sum;
            } 
          if(difference>Math.abs(sum-target)){
            difference=Math.abs(sum-target);
            bestsum=sum;
          }
        }
       }
        return bestsum;
    }
}