class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right= new int[nums.length];
        int rightsum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            left[i]=leftsum;
            leftsum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            right[i]=rightsum;
            rightsum+=nums[i];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(right[i]-left[i]);
        }
        return ans;
    }
}