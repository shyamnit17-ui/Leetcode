class Solution {
    public int[] singleNumber(int[] nums) {
       int xorA=0;
       int xorB=0;
       int xor=0;
        for(int num:nums){
           xor ^=num;
        }
        int i=0;
    while(((xor>>i)&1)==0){
        i++;
    }
    int mask=1<<i;
    for(int num:nums){
        if((num&mask)==0){
             xorA^=num;
        }
        else {
           xorB^=num;
        }
    }
    int arr[]= {xorA,xorB};
    return arr;
    }
}