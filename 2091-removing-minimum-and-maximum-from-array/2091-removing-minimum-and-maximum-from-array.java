class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxIdx=0;
        int minIdx=nums.length;
        for(int i=0;i<nums.length;i++){
         if(min>nums[i]){
            min=nums[i];
            minIdx=i;
         }
         if(max<nums[i]){
            max=nums[i];
            maxIdx=i;
         }
        }
        int count1=nums.length-maxIdx;
        int count2=nums.length-minIdx;
       int comp1=Math.max(count1,count2);
       int comp2=Math.max(maxIdx+1,minIdx+1);
       int comp3=Math.min(count1,maxIdx+1)+Math.min(count2,minIdx+1);
       int comp4=Math.min(comp1,Math.min(comp2,comp3));
        return comp4;
    }
}