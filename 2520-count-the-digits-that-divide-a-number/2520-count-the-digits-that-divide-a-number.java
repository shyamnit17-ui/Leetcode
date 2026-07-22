class Solution {
    public int countDigits(int num) {
        int count=0;
        int num2=num;
        while (num>0){
            int digit=num%10;
            if(num2%digit==0){ 
            count++;}
            num=num/10;
        }
        return count;
    }
}