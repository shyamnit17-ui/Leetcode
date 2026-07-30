class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int length = 0;
        int cost[] = new int[s.length()];
        for (int i = 0; i < cost.length; i++) {
            cost[i] += (int) Math.abs((s.charAt(i) - t.charAt(i)));
        }
      int netcost=0;
      int left=0;
      int right=0;
      while(right<cost.length){
        netcost+=cost[right];
        while(netcost>maxCost){
            netcost-=cost[left];
            left++;
        }
        length=Math.max(length,right-left+1);
        right++;
      }
        return length;
    }
}