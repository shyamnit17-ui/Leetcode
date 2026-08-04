class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
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
            set.add(nums[i]);
        }
        for(int i=small;i<=large;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}