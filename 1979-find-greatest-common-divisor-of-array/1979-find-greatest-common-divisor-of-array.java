class Solution {
    public static int gcd(int a,int b){
      while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a);
    }
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int large=0;
        for(int num:nums){
            if(num<small){
                small=num;
            }
            if(num>large){
                large=num;
            }
        }
        int gcd= gcd(small,large);
        return gcd;
    }
}