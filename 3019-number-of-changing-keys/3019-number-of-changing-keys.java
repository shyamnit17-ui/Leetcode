class Solution {
    public int countKeyChanges(String s) {
        String st=s.toLowerCase();
        int count=0;
       int n=1;
       while(n<s.length()){
        if(st.charAt(n)!=st.charAt(n-1)){
            count++;
        }
        n++;
       }
        return count;
    }
}