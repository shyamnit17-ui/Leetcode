class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int ans=0;
        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                   ans=ans|(1<<i);
                }
            count=0;
        }
        return ans;
    }
}