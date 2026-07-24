class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> set= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        int count=0;
        while(i<nums.length){
            int num=nums[i];
            int comp=k-nums[i];
          if(num!=comp){
            if (set.getOrDefault(num, 0) > 0 &&set.getOrDefault(comp, 0) > 0){          
            set.put(num,set.getOrDefault(num,0)-1);
            set.put(comp,set.getOrDefault(comp,0)-1);
            count++;
             if (set.getOrDefault(num, 0) == 0 ){
                set.remove(num);
             }
              if (set.getOrDefault(comp, 0) ==0 ){
                set.remove(comp);
              }
           }
          }
          else{
            if(set.getOrDefault(num,0)>=2){
              set.put(num,set.getOrDefault(num,0)-2);
              count++;
              if (set.getOrDefault(num, 0) == 0 ){
                set.remove(num);
              }
             
            }
          }
          i++;     
        }
        return count;
    }
}