class Solution {
    public static boolean check(String word){
        int n=word.length();
        int j=n-1;
        for(int i=0;i<=(n-1)/2;i++){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(check(words[i])==true){
                return words[i];
            }
        }
        return "";
    }
}