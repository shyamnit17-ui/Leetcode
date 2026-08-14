class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int start=0;
        int end=0;
        int maxlength=0;
        while(end<s.length()){
            char e=s.charAt(end);
            char st=s.charAt(start);
            map.put(e,map.getOrDefault(e,0)+1);
            char ed=s.charAt(end);
            while(map.get(ed)>2){  
            char ts=s.charAt(start);
                map.put(ts,map.getOrDefault(ts,0)-1);
               if(map.getOrDefault(ts,0)==0){
                   map.remove(ts);
                }
                start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
            end++;
        }
        return maxlength;
    }
}