class Solution {
    public int hIndex(int[] citations) {
        
       int i=0;
       int j=citations.length-1;
       int ans=0;
       while(i<=j){
            int mid=i+(j-i)/2;
            if(citations[mid]>=citations.length-mid){
            ans=Math.max(ans,citations.length-(mid));
             j=mid-1;
            }
            else{
              i=mid+1;
            }
            
       }
       return ans;
    }
}