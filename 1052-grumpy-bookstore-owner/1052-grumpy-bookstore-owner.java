class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        //baseline without implementing technique
        for(int i =0; i<grumpy.length ;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int si=0;
        int ei=minutes;
        int extras=0;
        int maxSatisfied=Integer.MIN_VALUE;
        //first window 
        for(int i=si;i<ei;i++){
            if(grumpy[i]==1){
                extras=extras+customers[i];
            }
        }
        maxSatisfied=Math.max(maxSatisfied , satisfied+extras);
        //window movement
        while(ei<grumpy.length){
            if(grumpy[si]==1){
                extras=extras-customers[si];
            }
            si++;    
            if(grumpy[ei]==1){
                extras=extras+customers[ei];
            }  
            ei++;
          maxSatisfied=Math.max(maxSatisfied , satisfied+extras);
        }
        return maxSatisfied;
    }
}