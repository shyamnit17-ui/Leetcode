class Solution {
    public void duplicateZeros(int[] arr) {
       int x=arr.length;
       for(int i=0;i<arr.length;i++){
        if(i!= arr.length &&arr[i]==0){
            x+=1;
         }
       }
       int j=x-1;
       int i=arr.length-1;
       
       while(i>=0){
          if(arr[i]!=0){
            if(0 <= j && j < arr.length){
                arr[j]=arr[i];
            }
            j--;
          }
          else{
            if(0 <= j && j < arr.length){
                 arr[j]=0; 
            }
             j--;
           if(0 <= j && j< arr.length){
             arr[j]=0;
            }
              j--;
          }
          i--;
       }
      
    }
}