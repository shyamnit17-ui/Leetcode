class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=Integer.MIN_VALUE;
       //speed range
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxspeed){
                maxspeed=piles[i];
            }
        }
        //binary search the speed range
    int netspeed=Integer.MAX_VALUE;
    int i=1;
    int j=maxspeed;
    long count=0;
     while(i<=j){
        int mid=i+(j-i)/2;
        for(int m=0;m<piles.length;m++){
            if(piles[m]%mid==0){
                count+=piles[m]/mid;
            }
            else{
                count+=piles[m]/mid+1;
            }
        }
        if(count<=h){
          netspeed=Math.min(mid,netspeed);
            j=mid-1;
        }
          else{
             i=mid+1;
          } 
            count=0;
     }
     return netspeed;
    }
}