class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallestpve=1;
        for(int i=0;i<nums.length;i++){
            int targetIndex=nums[i]-1;
           if(nums[i]>0 && nums[i]<=nums.length && nums[targetIndex] != nums[i]){
                int temp=nums[i];
                nums[i]=nums[targetIndex];
                nums[targetIndex]=temp;
                 i=i-1;
           }
            
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==smallestpve){
                smallestpve++;
            }
        }
        return smallestpve;
    }
}