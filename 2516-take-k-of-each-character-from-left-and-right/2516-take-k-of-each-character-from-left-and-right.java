class Solution {
    public int takeCharacters(String s, int k) {
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                totalA++;
            } else if (c == 'b') {
                totalB++;
            } else {
                totalC++;
            }
        }
        totalA -= k;
        totalB -= k;
        totalC -= k;
        if(totalA<0||totalB<0||totalC<0){
            return -1;
        }
        int freqA = 0;
        int freqB = 0;
        int freqC = 0;
        int start = 0;
        int end = 0;
        int maxlength=0;
        while (end < s.length()) {
            if(s.charAt(end)=='a'){
                freqA++;
            }
            else  if(s.charAt(end)=='b'){
                freqB++;
            }
            else{
                freqC++;
            }
            while(freqA>totalA||freqB>totalB||freqC>totalC){
                 if(s.charAt(start)=='a'){
                freqA--;
            }
            else  if(s.charAt(start)=='b'){
                freqB--;
            }
            else{
                freqC--;
            }
            start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
            end++;
        }
        return s.length()-maxlength;
    }
}