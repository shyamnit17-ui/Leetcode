class Solution {
    public boolean checkDivisibility(int n) {
        int digsum=0;
        int digprod=1;
        int k=n;
        while(k>0){
            int dig=k%10;
            digsum+=dig;
            digprod*=dig;
            k/=10;
        }
        int sum=digsum+digprod;
        if(n%sum==0){
            return true;
        }
        return false;
    }
}