class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int m = nums[i];
            if(map.getOrDefault(m,0)<2 && !map.containsKey(m-1)&& !map.containsKey(m+1)){
                list.add(m);
            }

        }
        return list;
    }
}