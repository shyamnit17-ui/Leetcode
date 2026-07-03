class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int target[]= new int[26];
        int window[]=new int[26];
        List<Integer> st= new ArrayList<>();
        for(int i=0; i<p.length();i++){
            target[p.charAt(i)-'a']++;  
        }
        for(int i=0; i<Math.min(s.length(),p.length());i++){
            window[s.charAt(i)-'a']++; 
        }
           boolean etrue=true; 
            for(int i=0;i<26;i++){
             if(window[i]!=target[i]){
                etrue=false;
                break;
             }
           }
           if(etrue==true){
            st.add(0);
           }
        int start=0;
        int end=p.length();
      while(end<=s.length()-1){
           window[s.charAt(start)-'a']--;
           start++;
           window[s.charAt(end)-'a']++;
            boolean eqtrue=true; 
            for(int i=0;i<26;i++){
             if(window[i]!=target[i]){
                eqtrue=false;
                break;
             }
           }
           if(eqtrue==true){
              st.add(start);
           }
           end++;
        }
        return st;
    }
}