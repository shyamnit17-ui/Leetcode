class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean arr[]=new boolean[101];
        List<Integer> list = new ArrayList<>();
        int small=101;
        int large=0;
        for(int i=0;i<nums.length;i++){
            if(small>nums[i]){
                small=nums[i];
            }
            if(large<nums[i]){
                large=nums[i];
            }
            arr[nums[i]]=true;
        }
        for(int i=small;i<=large;i++){
            if(arr[i]==false){
                list.add(i);
            }
        }
        return list;
    }
}