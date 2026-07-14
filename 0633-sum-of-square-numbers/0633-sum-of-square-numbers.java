class Solution {
    public boolean judgeSquareSum(int c) {
       int root=(int)Math.pow(c,0.5);
       if(c==0){
        return true;
       }
      for(int i=root;i>0;i--){    
       int need= c- i*i;
       int a=(int)Math.pow(need,0.5);
          if(a*a+i*i==c){
        return true;
       }
      }
       return false;
    }
}