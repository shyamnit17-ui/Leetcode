class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int count=0;
        int sumdigits=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sumdigits+=digit;
                ans+=digit*Math.pow(10,count);
                count++;
            }
            n=n/10;
        }
        return ans*sumdigits;
    }
}