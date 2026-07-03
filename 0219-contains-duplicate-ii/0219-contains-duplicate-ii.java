class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {  
        HashSet<Integer> map = new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                  return true;
            } 
             map.add(nums[i]);
             count++;
            if(count>k){
                map.remove(nums[i-k]);
                count--;
            }
            
        }
        return false;
    }
}