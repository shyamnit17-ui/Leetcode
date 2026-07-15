class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=1;
        int cost=0;
        while(j<colors.length()){
            if(colors.charAt(i)!=colors.charAt(j)){
              i=j;
              j++;
            }
            else{
                if(neededTime[i]>=neededTime[j]){
                    cost+=neededTime[j];
                    j++;
                }
                else if(neededTime[j]>neededTime[i]){
                    cost += neededTime[i];
                    i = j;
                    j++;
                }
            }
        }
        return cost;
    }
}