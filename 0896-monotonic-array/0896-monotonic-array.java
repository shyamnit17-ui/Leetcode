class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean bool = true;
        boolean bool2 = true;
        for (int i = 0; i < nums.length - 1; i++) {
            //monotonic increasing
            if (nums[i] < nums[i + 1]) {
                bool = false;
            }
            //monotonic decreasing
            else if (nums[i] > nums[i + 1]) {
                bool2 = false;
            }

            if (bool == false && bool2 == false) {
                return false;
            }
        }
        return bool || bool2;
    }
}