class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        while (l <= r) {
            int k = l;
            int sum = 0;
            int start = 0;
            int end = k;
            int minsumsub = Integer.MAX_VALUE;
            //first window
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
            }
            if (sum > 0 && minsumsub > sum) {
                minsumsub = sum;
            }
            int n = nums.size();
            while (end < n) {
                sum -= nums.get(start);
                start++;
                sum += nums.get(end);
                end++;
                if (sum > 0 && minsumsub > sum) {
                    minsumsub = sum;
                }
            }
            minsum=Math.min(minsum,minsumsub);
            l++;
        }
        if(minsum==Integer.MAX_VALUE){
            return -1;
        }
        return minsum;
    }
}