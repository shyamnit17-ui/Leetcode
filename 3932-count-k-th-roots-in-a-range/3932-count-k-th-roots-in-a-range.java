class Solution {
    public int countKthRoots(int l, int r, int k) {
        long i=1;
        long power=0;
        int count=0;
        if(k==1){
            return r-l+1;
        }
        while(power<=r){
            power=(long)Math.pow(i,k);
            i++;
            if(power>=l&&power<=r){
               count++; 
            } 
            }
            if(l==0){
                count++;
            }
            return count;
    }
}