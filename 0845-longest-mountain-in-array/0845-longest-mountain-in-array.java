class Solution {
    public int longestMountain(int[] arr) {
       int mtlength=0;
       for(int i=1;i<arr.length-1;i++){
        int left=i;
        int right=i;
        if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
            while(left>0 &&arr[left]>arr[left-1]){
                left--;
            }
              while(right<arr.length-1&&arr[right]>arr[right+1]){
                right++;
            }
            mtlength=Math.max(mtlength,right-left+1);
        }
       }
       return mtlength;
    }
}