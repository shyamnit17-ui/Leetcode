class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
         int num=Math.abs(nums[i]);
         int index=num-1;
         if(nums[index]<0){
            list.add(index+1);
         }
         nums[index]=0-nums[index];
       }
        return list;
     }
}