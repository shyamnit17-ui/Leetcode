class Solution {
    public int reverse(int x) {
        int k=Math.abs(x);
        long ans=0;
        while(k>0){
          ans=ans*10+k%10; 
          if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE){
            return 0;
            }
          k/=10;
        }
        if(x>0 && ans<Integer.MAX_VALUE){
            return (int)ans;
        }
    

        return -(int)ans;
    }
}