class Solution {
    public int pivotInteger(int n) {
     if(n==1){
        return 1;
       }
        
        int sum=0;
        int sum2=0;
      for(int i=1;i<=n;i++){
        sum+=i;
      }
      for(int i=1;i<=n;i++){
        sum-=i;
       
        if(sum==sum2){
            return i;
        }
         sum2+=i;
      }
       

       return -1;
    }
}