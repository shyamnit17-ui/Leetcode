class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String sb:patterns){
            if(word.contains(sb)){
                count++;
            }
        }
        return count;
    }
}