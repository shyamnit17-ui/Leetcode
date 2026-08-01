class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        if(nums.length<3){
          for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                 list.add(nums[i]);
            }
          }
          return list;
        }
      int candidate1=Integer.MIN_VALUE;
      int freq1=0;
      int candidate2=Integer.MIN_VALUE;
      int freq2=0;
      for(int i=0;i<nums.length;i++){
         if(candidate1==nums[i]){
            freq1++; 
        }
        else if(candidate2==nums[i]){
            freq2++; 
        }
      
        else if(freq1==0&&nums[i]!=candidate2){
            candidate1=nums[i];
            freq1++;
        }
        else if(freq2==0){
            candidate2=nums[i];
            freq2++;
        }
         else{
            freq1--;
            freq2--;
        }
       
      }
      
    int n=nums.length;
    int f1=0;
    int f2=0;
    for(int i=0;i<nums.length;i++){
        if(candidate1==nums[i]){
            f1++;
        }
        if(candidate2==nums[i]){
            f2++;
        }
    }
    if(f1>n/3){
        list.add(candidate1);
    }
    if(f2>n/3){
        if(!list.contains(candidate2))
        list.add(candidate2);
    }
     return list;
    }
}