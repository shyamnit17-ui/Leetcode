class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int start=0;
        int end=0;
        int maxlength=0;
      int frequency=1;  
        while(end<fruits.length){     
         if(map.containsKey(fruits[end])){
            int newfreq= map.get(fruits[end])+1;
            map.replace(fruits[end],newfreq);

            }

         else{
             map.put(fruits[end],frequency);
         }
           while(start<fruits.length && map.size()>2){
            int currfreq=  map.get(fruits[start]); 
            currfreq--; 
            map.replace(fruits[start],currfreq);
             if(currfreq==0){
                map.remove(fruits[start]);
             }
         
             start++;
           }
          maxlength=Math.max(maxlength,end-start+1);
          end++;
        }
        return maxlength;
    }
}