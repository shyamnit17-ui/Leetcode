class Solution {
    public int smallestNumber(int n, int t) {
      int product=1;
     
      int ans=n;
      for(int i=n;i<101;i++){
         int k=i;
         while(k>0){
            int digit=k%10;
            product=product *digit;
            k=k/10;
         } 
          if(product%t==0){
                return i;
            }
            product=1;
        }
        return ans;
    }
}