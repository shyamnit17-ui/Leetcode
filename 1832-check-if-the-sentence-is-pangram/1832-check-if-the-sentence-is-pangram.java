class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        for(int i=0;i<26;i++){
            if(!set.contains((char)(i+'a'))){
                return false;
            }
        }
        return true;
    }
}