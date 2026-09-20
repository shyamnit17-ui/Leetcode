class Solution {
    public int reverseDegree(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int m=-c+'a'+26;
            count+=(i+1)*m;
        }
        return count;
    }
}