class Solution {
    public int uniqueXorTriplets(int[] nums) {
      int n=nums.length;
      if(n<=2){
        return n;
      }
      int ans=0;
      for(int count=1;ans<=nums.length;count++){
        ans=(int)Math.pow(2,count);
      }
      return ans;
    }
}