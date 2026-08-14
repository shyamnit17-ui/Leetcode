class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int start=0;
        int end=0;
        int maxlength=0;
        while(end<nums.length){
            int en=nums[end];
            int st=nums[start];
            map.put(en,map.getOrDefault(en,0)+1);
            int ed=nums[end];
            while(map.get(ed)>k){  
            int ts=nums[start];
                map.put(ts,map.getOrDefault(ts,0)-1);
               if(map.getOrDefault(ts,0)==0){
                   map.remove(ts);
                }
                start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
            end++;
        }
        return maxlength;
    }
}