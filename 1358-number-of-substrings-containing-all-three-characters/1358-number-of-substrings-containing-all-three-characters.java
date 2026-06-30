class Solution {
    void updateFreq(int[] freq, char ch, int delta) {
        freq[ch - 'a'] += delta;
    }

    boolean isValid(int[] freq) {
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }

    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        int freq[] = new int[3];

        while (right < s.length()) {
         updateFreq(freq, s.charAt(right), +1);
             right++;
       
         while(isValid(freq)){      
            updateFreq(freq, s.charAt(left), -1);
             left++; 
           }  
          count+=left;  
             
        }   
        return count;
    }
}