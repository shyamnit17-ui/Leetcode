class Solution {
    public boolean judgeSquareSum(int c) {
       int root=(int)Math.sqrt(c);
       if(c==0){
        return true;
       }
      for(int i=root;i>0;i--){    
       int need=  i*i;
       int a=(int)Math.sqrt(c-need);
          if(a*a+need==c){
        return true;
       }
      }
       return false;
    }
}