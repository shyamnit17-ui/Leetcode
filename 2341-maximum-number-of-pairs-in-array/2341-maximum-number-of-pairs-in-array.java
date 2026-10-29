class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int pairs=0;
        int odds=0;
        for(int num:map.values()){
            pairs+=num/2;
            if(num%2!=0){
                odds++;
            }
        }
        arr[0]=pairs;
        arr[1]=odds;
        return arr;
    }
}