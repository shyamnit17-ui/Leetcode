class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=0;
        int arr[]=nums.clone();
        Arrays.sort(arr);
        if(Arrays.equals(nums,arr)){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=arr[i]){
                start=i;
                break;
            }
        }
        int end=0;
           for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=arr[i]){
                 end=i;
                 break;
            }
        }
        int ans=end-start+1;
        return ans;
    }
}