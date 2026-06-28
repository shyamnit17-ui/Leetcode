class Solution {
    public static int maxConsecutiveanswer(String s, int k, char c) {
        int start=0;
        int end=0;
        int frequencyc=0;
        int maxans=0;
        while(end<s.length()){
            //expandingwindow
            if(s.charAt(end)==c){
                frequencyc++;
            }
            end++;
           int windowlen=end-start;    
            //invalid window
           while(end-start-frequencyc >k){
              if(s.charAt(start)==c){
                frequencyc--;
              }
              start++;
           }
              maxans=Math.max(maxans,end-start);    
        } 
         return maxans;   
    }
   public int maxConsecutiveAnswers(String s, int k){
               int max1=maxConsecutiveanswer( s, k, 'T');
               int max2=maxConsecutiveanswer( s,  k,  'F');

            int finalans=Math.max(max1,max2);
         return finalans; 
    }
}