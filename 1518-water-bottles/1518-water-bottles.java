class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int temp=numBottles;
        int ans=numBottles;
        while(temp>=numExchange){
            ans+=temp/numExchange;
            temp= temp/numExchange +temp%numExchange;
        }
        return ans;
    }
}