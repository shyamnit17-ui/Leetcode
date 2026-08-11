class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j=1;
        int i=0;
        int sum=nums[0];
        while(j<nums.length){
            if(nums[j]==nums[j-1]+1){
                sum+=nums[j];
                j++;
            }
           else{
             break;
           }
        }
           if(!set.contains(sum)){
             return sum;
           }
        
           else{
              while(set.contains(sum)){
                 sum++;
              }
           }
        
        return sum;
    }
}