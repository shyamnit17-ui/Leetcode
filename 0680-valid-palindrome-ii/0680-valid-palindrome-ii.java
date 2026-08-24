class Solution {
    public boolean check(String s2){
        int j=s2.length()-1;
        int i=0;
        while(i<=j){
            if(s2.charAt(i)!=s2.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       return true;
    }
    public boolean validPalindrome(String s) {
        boolean ans=true;
        int start=0;
        int end=s.length()-1;
        int count=0;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
             if(count<1&&check(s.substring(start+1,end+1))){
                count++;
                start++;
             }
             else if(count<1&&check(s.substring(start,end))){
                count++;
                end--;
             }
             else{
                return false;
             }
            }    
        }
        return true;
    }
}