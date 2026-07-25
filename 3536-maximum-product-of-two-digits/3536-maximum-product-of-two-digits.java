class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        int max = 0;
        int max2 = 0;
        for (int num : list) {
            max = Math.max(max, num);
        }
        list.remove((Integer)max);
        for (int num : list) {
            max2 = Math.max(max2, num);
        }
        return max*max2;
    }
}