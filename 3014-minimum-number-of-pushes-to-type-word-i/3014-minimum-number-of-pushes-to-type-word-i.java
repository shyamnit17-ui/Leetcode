class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }
       else if(word.length()>8&&word.length()<17){
            return 2*word.length()-8;
        }
       else if(word.length()>=17&&word.length()<25) {
           return 3*word.length()-24;
        }
       else if(word.length()==25){
        return 52;
       }
       return 56;
    }
}