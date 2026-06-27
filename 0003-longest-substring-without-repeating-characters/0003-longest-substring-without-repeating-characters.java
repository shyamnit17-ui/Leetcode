class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sb= new HashSet<>();
        int start=0;
        int end=0;
        int maxlength=0;
        if(s.length()==0){
            return s.length();
        }
        while(end<s.length()){
           while(sb.contains(s.charAt(end))){
                sb.remove(s.charAt(start));
                start++;
            }
            sb.add(s.charAt(end));
            end++;
            int length=end-start; 
            maxlength=Math.max(length,maxlength);
        }
        return maxlength;
    }
}