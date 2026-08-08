class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int i=min;
        int j=max;
        int smallest=Integer.MAX_VALUE;
        while(i<=j){
            int mid=i+(j-i)/2;
             int sum=0;
            for(int m=0;m<nums.length;m++){
                if(nums[m]%mid!=0){sum+=nums[m]/mid+1;}
                else{
                    sum+=nums[m]/mid;
                }
            }
            if(sum>threshold){
                i=mid+1;
            }
            else{
                smallest=Math.min(mid,smallest);
                j=mid-1;
            }
        }
        return smallest;
    }
}