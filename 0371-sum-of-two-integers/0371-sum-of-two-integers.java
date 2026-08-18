class Solution {
    public int getSum(int a, int b) {
        int ans=0;
        int c=0;
        for(int i=0;i<32;i++){
            int ith_a=(a>>i)&(1);
            int ith_b=(b>>i)&(1);
            ans|=(ith_a<<i)^(ith_b<<i)^(c<<i);
             c=(ith_a&ith_b)|c&(ith_a^ith_b);    
        }
        return ans;
    }
}