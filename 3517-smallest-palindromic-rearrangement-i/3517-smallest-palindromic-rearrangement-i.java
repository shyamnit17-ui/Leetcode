class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder left = new StringBuilder(s.length()/2);
        StringBuilder middle = new StringBuilder(1);
        for (int i = 0; i < 26; i++) {
            int count = 1;

            if (freq[i] % 2 != 0) {
                middle.append((char) (i + 'a'));
            }
            for (int k = 0; k < freq[i] / 2; k++) {
                left.append((char) ('a' + i));
            }

        }
        return left.toString() + middle.toString() + left.reverse().toString();
    }
}