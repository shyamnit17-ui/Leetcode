class Solution {
    public int[] nextGreaterElements(int[] nums) {
       
        int ans[]=new int[nums.length];
        Arrays.fill(ans, -1); 
        for(int i=0;i<nums.length;i++)
        {   int arr[]=nums;
            int k=i;
            boolean found=false;
            while((k+1)%nums.length!=i){
                if(arr[(k+1)%(nums.length)]>arr[i]){
                    ans[i]=arr[(k+1)%nums.length];
                    found=true;
                    break;
                }
               k++;
            }
          
        }
        return ans;
    }
}