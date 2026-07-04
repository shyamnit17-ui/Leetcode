class Solution {
     public static Map<Character, Integer> getFrequency(String st) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for(int i=0;i<st.length();i++){
            if(frequencies.containsKey(st.charAt(i))){
                int newfreq=frequencies.get(st.charAt(i))+1;
                frequencies.replace(st.charAt(i),newfreq);
            }
            else{
                frequencies.put(st.charAt(i),1);
            }
        }
        return frequencies;
    }
    public String minWindow(String s, String t) {
       Map<Character,Integer> map1= getFrequency(t);
       HashMap<Character,Integer> map2= new HashMap<>();

    if(s.length()<t.length()){
        return "";
    }
    int start=0;
    int end=0;
    int matched=0;
    String ans="";
    int smallest=s.length();
    int startbest=0;
    int endbest=0;
    boolean found=false;
    while(end<s.length()){
        char key=s.charAt(end);
        if(map2.containsKey(key)){
             map2.replace(key,map2.get(key)+1);
        }
        else{
             map2.put(key,1);
        } 
        Integer currentfreq1=map2.get(key);
        Integer requiredfreq=map1.get(key);
        if(requiredfreq!=null){
         if(currentfreq1.equals(requiredfreq)){
            matched++;
        }
        }  
        while(matched==map1.size()){
         char c=s.charAt(start);
          Integer requiredfreq2=map1.get(c);
              if(end-start+1<=smallest){
                smallest=end-start+1;
                startbest=start;
                endbest=end;
                found=true;
              }
             map2.replace(c,map2.get(c)-1); 
            Integer currentfreq=map2.get(c);
            if(requiredfreq2!=null){
                 if(currentfreq<requiredfreq2){
                 matched--;
             }
            }
             start++;
        }
        end++;
    }
       if(found==false){
        return "";
       }
     ans=s.substring(startbest,endbest+1);
      return ans;
    }
}