class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        //compare arr[l] and arr[r+1]
        int left = 0;
        int right = k;
        while (right < arr.length) {
            if (x - arr[left] > arr[right] - x) {
                    left++; 
               }
             else {
              break;
            }  
            right++;
        }
        for (int i = left; i < right; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}