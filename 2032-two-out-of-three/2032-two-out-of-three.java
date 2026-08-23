class Solution {
    public void getnum(int[] nums,int[] nums4,List<Integer> list){
          HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }
        for (int i = 0; i < nums4.length; i++) {
            if (set1.contains(nums4[i])) {
                if(!list.contains(nums4[i])){
                    list.add(nums4[i]);
                }
            }
        }
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        getnum(nums1,nums2,list);
        getnum(nums2,nums3,list);
        getnum(nums3,nums1,list);
        return list;
    }
}