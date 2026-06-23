class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int right = 0;
        int left = 0;
        int maxfreq = 0;
        int ans = 0;
        while (right < s.length()) {
           
            //expanding a window 
            arr[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq, arr[s.charAt(right) - 'A']);
             right++; 
                while (right-left - maxfreq > k) {
                arr[s.charAt(left)-'A']--;
                left++;  
            } 
            int windowlen = right - left ;
            ans=Math.max(ans,windowlen);
        }
            return ans;
    }
}