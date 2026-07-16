class Solution {
    private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public long gcdSum(int[] nums) {
        int prefixGcd[]= new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            prefixGcd[i]= gcd(nums[i],max);
        }
      Arrays.sort(prefixGcd);
      int start=0;
      int end=nums.length-1;
      long ans=0;
      while(start<end){
        ans+=gcd(prefixGcd[start],prefixGcd[end]);
        start++;
        end--;
      }
      return ans;
    }
}