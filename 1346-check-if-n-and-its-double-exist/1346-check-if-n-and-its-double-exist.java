class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            set.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(set.containsKey(2*arr[i])&&set.get(arr[i]*2)!=i){
                return true;
            }
        }
        return false;
    }
}