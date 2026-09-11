class Solution {
    public int countKeyChanges(String s) {
  
        int count=0;
       int i=1;
       while(i<s.length()){
        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))){
            count++;
        }
        i++;
       }
        return count;
    }
}