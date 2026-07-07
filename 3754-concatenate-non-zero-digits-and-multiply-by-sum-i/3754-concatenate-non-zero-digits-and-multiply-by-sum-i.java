class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int count=1;
        int sumdigits=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sumdigits+=digit;
                ans+=digit*count;
                count*=10;
            }
            n=n/10;
        }
        return ans*sumdigits;
    }
}