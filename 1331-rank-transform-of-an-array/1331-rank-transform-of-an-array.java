class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedCopy = Arrays.copyOf(arr, arr.length);
        HashMap<Integer,Integer> map= new HashMap<>();
        Arrays.sort(sortedCopy);
        int count=1; 
        for(int num: sortedCopy){
            if(!map.containsKey(num)){
                  map.put(num,count);   
                  count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}