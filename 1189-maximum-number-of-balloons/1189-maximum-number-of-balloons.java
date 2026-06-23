class Solution {
    public int maxNumberOfBalloons(String text) {
        int countb=0;
        int counta=0;
        int countl=0;
        int counto=0;
        int countn=0;
        for(int i =0; i< text.length(); i++){
            if(text.charAt(i)=='b'){
                countb++;
            }
             else if(text.charAt(i)=='a'){
                counta++;
            }
             else if(text.charAt(i)=='l'){
                countl++;
            }
            else if(text.charAt(i)=='o'){
                counto++;
            }
             else if(text.charAt(i)=='n'){
                countn++;
            }
        }
    int min = Math.min(countb, Math.min(counta, Math.min(countl/2, Math.min(counto/2, countn))));
        return min;
    }
}