class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        int start=0;
        int end=3;
        int count=0;
        int arr[]=new int[26];
        for(int i=start;i<end;i++){
            arr[s.charAt(i)-'a']++;
        }
    //checking for duplicates
        boolean bool=false;
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                bool=true;
            }
        }
        if(bool==false){
            count++;
        }
        while(end<s.length()){
            char c=s.charAt(end);
            char d=s.charAt(start);
            arr[d-'a']--;
            start++;
            arr[c-'a']++;
            char e=s.charAt(start);
            char f=s.charAt(start+1);
            if(arr[e-'a']<=1&&arr[f-'a']<=1&&arr[c-'a']<=1){
                count++;
            }
            end++;
        }
        return count;
    }
}