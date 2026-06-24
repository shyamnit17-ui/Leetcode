class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr[]=new int[26];
        int si=0;
        int ei=s1.length();
        int count=0;
        if(s1.length()>s2.length()){
            return false;
        }

            for(int i=si;i<ei;i++){
            arr[s1.charAt(i)-'a']--;
            arr[s2.charAt(i)-'a']++;
            } 
        while(ei<s2.length()){
         boolean allzeros=true;
           for(int x : arr){
                if(x!=0){
                    allzeros=false;
                }
           }
            if(allzeros){
                return true;
            }
            else{
                arr[s2.charAt(si)-'a']--;
                si++;
                arr[s2.charAt(ei)-'a']++;
                ei++;
            }
        }
        //final window
          boolean allzeros=true;
           for(int x : arr){
                if(x!=0){
                    allzeros=false;
                }
           }
            
       return allzeros;
    }
}