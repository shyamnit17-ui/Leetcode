class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[] = new int[nums.length];
        int si = 0;
        int ei = 2 * k;
        long sum = 0;
            for (int m = 0; m<nums.length && m < 2 * k+1; m++) {
                  sum+=nums[m];
                }
            for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length) {
                ans[i] = -1;
            } 
            }
            
            int mid;
           
         while(ei<nums.length){
                    mid=ei-(ei-si)/2;
                    ans[mid]=(int)(sum/(2*k+1));
                    sum=sum-nums[si];
                    si++; 
                    ei++;  
                    if(ei!=2*k && ei<nums.length){
                         sum=sum+nums[ei];
                    }
                }

        
        return ans;
    }
}