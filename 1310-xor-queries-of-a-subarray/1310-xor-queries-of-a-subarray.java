class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefixXOR[]=new int[arr.length];
        int preXOR=0;
        for(int i=0;i<arr.length;i++){
            preXOR^=arr[i];
           prefixXOR[i]= preXOR;
        }
        int ans[]= new int[queries.length];
        for(int i=0;i<ans.length;i++){
            if(queries[i][0]==0){
                 ans[i]^=prefixXOR[queries[i][1]];
            }else{
                 ans[i]^=(prefixXOR[queries[i][0]-1])^prefixXOR[queries[i][1]];
            }
         
        }
        return ans;
    }
}