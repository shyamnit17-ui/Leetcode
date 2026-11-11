class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long costA= (long)costBoth*(Math.max(need1,need2));
        long costB= (long)cost1*need1+(long)cost2*need2;
        long x=Math.min(need1,need2);
        long r1=need1-x;
        long r2=need2-x;
        long costC = x*costBoth + cost1*r1+cost2*r2;
        return Math.min(costA,Math.min(costB,costC));
    }
}