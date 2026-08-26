class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int start = 0;
        int end = 0;
        int countOne = 0;
   
        String best = null;
        while (end < s.length()) {
            char c = s.charAt(end);
            if (c == '1') {
                countOne++;
            }
        
            while (countOne >= k) {
                char st = s.charAt(start);
               
            if(best==null){
                best=s.substring(start,end+1);
            }
            if (best.length()>(end-start+1)) {
                best = s.substring(start, end+1);
            } 
            else if(best.length()==(end-start+1)) {
                if (best.compareTo(s.substring(start, end+1)) > 0) {
                    best = s.substring(start, end+1);
                }
            }
                 if (st == '1') {
                    countOne--;
                }
                start++;
            }

            end++;
        }
        if(best==null){
            return "";
        }
        return best;
    }
}