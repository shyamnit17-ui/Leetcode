class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if (nums1.length > nums2.length) {
            for (int num : nums1) {
                set1.add(num);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (set1.contains(nums2[i])) {
                    list.add(nums2[i]);
                    set1.remove(nums2[i]);
                }
            }
        } else {
            for (int num : nums2) {
                set1.add(num);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (set1.contains(nums1[i])) {
                    list.add(nums1[i]);
                    set1.remove(nums1[i]);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}