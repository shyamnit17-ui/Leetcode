class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxlen=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            maxlen=Math.max(maxlen,count+1);
        }
        return maxlen;
    }
}