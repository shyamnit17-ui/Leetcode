class Solution {
    public static void shiftRightFrom(int[] arr, int targetIndex) {
    
    for (int i = arr.length - 2; i >= targetIndex; i--) {
        arr[i + 1] = arr[i];
    }
}

    public void duplicateZeros(int[] arr) {
      for(int i=0;i<arr.length-1;i++){
        if(arr[i]==0){
           shiftRightFrom(arr,i);
           i++;
        }
        }
    }
}