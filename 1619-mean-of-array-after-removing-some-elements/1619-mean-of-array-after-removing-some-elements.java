class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for(int i=(0+arr.length/20);i<(arr.length-arr.length/20);i++){
            sum+=arr[i];
        }
        int n=arr.length-2*arr.length/20;
        double ans=sum/(double)n;
        return ans;
    }
}