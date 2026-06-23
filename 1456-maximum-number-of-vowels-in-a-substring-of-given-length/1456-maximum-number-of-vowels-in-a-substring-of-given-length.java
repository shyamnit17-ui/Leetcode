class Solution {
      public static boolean ifvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int si=0;
        int ei=k;
        int count=0;
        int maxcount=0;
        for(int i=0;i<k;i++){
            if(ifvowel(s.charAt(i))==true){
                count++;
            }
        }
          maxcount=Math.max(count,maxcount);
        while(ei<s.length()){
             if(ifvowel(s.charAt(ei))){
                count++;
             }
             ei++;
             if(ifvowel(s.charAt(si))){
                count--;
             }
             si++;
           maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}