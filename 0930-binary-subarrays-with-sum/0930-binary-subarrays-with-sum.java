class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int countSubarray=0; 
       
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);    
       for(int i=0;i<nums.length;i++){
            sum+=nums[i];
              if(map.containsKey(sum-goal)){
                 countSubarray+=map.get(sum-goal);
              }
         if(map.containsKey(sum)){
              map.replace(sum,map.get(sum)+1);  
         }
         else{
            map.put(sum,1);
         }
                
        }
        return countSubarray;
    }
}