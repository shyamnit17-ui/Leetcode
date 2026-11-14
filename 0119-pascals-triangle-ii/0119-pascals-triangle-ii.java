class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list= new ArrayList<>();
        int dp[]=new int[rowIndex+1];
        dp[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int m=i;m>=1;m--){
                dp[m]=dp[m]+dp[m-1];
                if(i==rowIndex){
                    list.add(dp[m]);
                }
            }
        }
        list.add(dp[0]);
        return list;
    }
}