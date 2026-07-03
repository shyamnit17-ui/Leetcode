class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {  
        HashSet<Integer> map = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                  return true;
            } 
             map.add(nums[i]);
             
            if(i>=k){
                map.remove(nums[i-k]);
            }

        }
        return false;
    }
}