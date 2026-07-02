class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> ints= new HashSet<>();
       int maxlength=0;
        for(int i=0;i<nums.length;i++){
            ints.add(nums[i]);
        }
  
      int currentlength=1;
        for(int num:ints){
           if(!ints.contains(num-1)){
             int start=num;
            
            while(start!=Integer.MAX_VALUE && ints.contains(start+1)){
               currentlength++; 
               start++;  
           }
            
           maxlength=Math.max(maxlength,currentlength);
           currentlength=1;
           }
        }
    return maxlength;
    }
}