class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length;i++){
            int count1=1;
            boolean boolean1=true;
            boolean boolean2=true;
            int count2=1;
            for(int j=i;j<nums.length-1;j++){
                if(nums[j]<=nums[j+1]){
                    boolean2=false;
                }
                 if(nums[j]>=nums[j+1]){
                    boolean1=false;
                }
                if(boolean1==true&&boolean2==true){
                    continue;
                }
                else if(boolean1==false&&boolean2==false){
                    continue;
                }
                else if(boolean1==true&&boolean2==false){
                    count1++;
                }
                else{
                    count2++;
                }
                count=Math.max(count,Math.max(count1,count2));
            }
        }
        return count;
    }
}