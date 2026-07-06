class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return  Integer.compare(b[1], a[1]); // End descending
            }
             else{
               return  Integer.compare(a[0], b[0]);
             }  // Start ascending
        });
        int maxEndSoFar=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<intervals.length;i++){
          if(intervals[i][1]>maxEndSoFar){
                ans+=1;
            }  
             if(intervals[i][1]>maxEndSoFar){
                maxEndSoFar=intervals[i][1];
            }
           
        }
        return ans;
    }
}