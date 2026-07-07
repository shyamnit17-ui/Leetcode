class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> map= new HashMap<>();
      int sum=0;
      int length=0;
      int firstocur=0;
      //saving preffix sum
      map.put(0,-1);
      for(int i=0;i<nums.length;i++){
       
        if(nums[i]==0){
            sum-=1;
        }
        else{
            sum+=1;
        }
       
         if(!map.containsKey(sum)){
              map.put(sum,i);
           } 
             length=Math.max(length,i-map.get(sum));
      } 
    
      return length;
    }
}