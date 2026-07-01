class Solution {
    public static int[] getmasks(String[] words){
        int arr[]= new int[words.length];
        int mask=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
              String st= words[i];
              int ch= st.charAt(j)-'a';
              mask=mask|1<<ch;
            }
            arr[i]=mask;
            mask=0;
            
        }
        return arr;
    }
    public int maxProduct(String[] words) {
            int start=0;
            int end=words.length-1;
            int maximum=0;
            int masks[]=getmasks(words);
           for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((masks[i]&masks[j])==0){
                    maximum=Math.max(maximum,words[i].length()*words[j].length());
                }
            }
           }
           return maximum;
    }
}