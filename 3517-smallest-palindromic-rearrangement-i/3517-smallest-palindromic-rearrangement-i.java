class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int count=1;
            if(freq[i]>0){
                if(freq[i]%2!=0){
                    middle.append((char)(i+'a'));
                }
                while(count<=freq[i]/2){
                    left.append((char)(i+'a'));
                    count++;
                }
            }
        }
      return left.toString() + middle.toString() + left.reverse().toString();
    }
}