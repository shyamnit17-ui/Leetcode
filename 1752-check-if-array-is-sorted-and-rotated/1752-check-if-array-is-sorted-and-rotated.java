class Solution {
   
    public boolean check(int[] nums) {
        int copy[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(copy);
     int x=0;
     boolean bool[]=new boolean[nums.length+1];
     Arrays.fill(bool, true);
     while(x<=nums.length){
        for(int i=0;i<nums.length;i++){
            if(copy[i]!=nums[(i+x)%nums.length]){
                bool[x]=false;
            }
        }
        x++;
     }
     for(int i=0;i<=nums.length;i++){
        if(bool[i]==true){
            return true;
        }
        
     }
     return false;
    }
}