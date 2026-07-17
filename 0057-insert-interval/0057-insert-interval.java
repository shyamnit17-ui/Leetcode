class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> list= new ArrayList<>();
        int idx=0;
        boolean inserted=false;
        for(int i=0;i<intervals.length;i++){
            idx=i;
            int currentStart=intervals[i][0];
            int currentEnd=intervals[i][1];
            if(currentEnd<newInterval[0]){
                list.add(new int[]{currentStart,currentEnd});
            }
           else if(currentStart>newInterval[1]){
                
                list.add(newInterval);
                list.add(new int[]{currentStart,currentEnd});
                inserted=true;
                 break;
            }
            else{
             newInterval[0] = Math.min(newInterval[0], currentStart);
              newInterval[1] = Math.max(newInterval[1], currentEnd);
            }
        }
         while(idx+1<intervals.length){
            list.add(intervals[idx+1]);
            idx++;
         }
         if(inserted==false){
            list.add(newInterval);
         }
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
          ans[i][0]= list.get(i)[0];
          ans[i][1]=list.get(i)[1];
        }
        return ans;
    }
}