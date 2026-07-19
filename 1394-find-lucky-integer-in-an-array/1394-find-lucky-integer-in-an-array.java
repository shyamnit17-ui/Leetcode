class Solution {
    public int findLucky(int[] arr) {
       int nums[]=new int[500];
        for(int i=0;i<arr.length;i++){
           nums[arr[i]-1]++;
        }
        int lucky=0;
        for(int i=0;i<arr.length;i++){
            if(nums[arr[i]-1]==arr[i]){
                lucky=Math.max(arr[i],lucky);
            }
        }  
    return lucky>0 ?lucky:-1;
    }
}