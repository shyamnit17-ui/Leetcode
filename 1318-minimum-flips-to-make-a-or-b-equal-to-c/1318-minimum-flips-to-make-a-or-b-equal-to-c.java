class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        for(int i=0;i<32;i++){
            int ithA=  (a >> i) & 1;
            int ithB=  (b >> i) & 1;
             int ithC=  (c >> i) & 1;
            if(ithC==0){
                count=count+ithA+ithB;
            }
            else{
                if(ithA==0 && ithB==0){
                    count++;
                }
            }
        }
        return count;
    }
}