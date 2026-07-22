class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int res[]={-1,-1};
        int left=nums.length;
        int right=-1;
        boolean exist=false;
        while(start<=end){
            int mid=end-(end-start)/2;
            if(nums[mid]==target){
               if(mid<left){
                left=mid;
               } 
               end=mid-1;
               exist=true;
            }
            else if(nums[mid]>target){
                end=mid-1; 
            }
            else{
                start=mid+1;
            }
        }
        int start2=0;
        int end2=nums.length-1;
          while(start2<=end2){
            int mid=end2-(end2-start2)/2;
            if(nums[mid]==target){
               if(mid>right){
                right=mid;
               } 
               start2=mid+1;
               exist=true;
            }
            else if(nums[mid]>target){
                end2=mid-1; 
            }
            else{
                start2=mid+1;
            }
        }
        if(exist==false){
            res[0]=-1;
        }
        else{
            res[0]=left;
        }
        res[1]=right;
        return res;
    }
}