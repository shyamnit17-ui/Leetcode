class Solution {
    public int minimumPushes(String word) {
       int arr[]=new int[26];
        int freq=0;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            arr[c-'a']++;
        }
        int ans=0;
       Arrays.sort(arr);
       int count=1;
       for(int i=25;i>=0;i--){
        if(arr[i]==0) {
            continue;
        }
        if(count<9){
           ans+=arr[i];
         }
        else if(count<17){
            ans+=arr[i]*2;
        }
        else if(count<25){
            ans+=arr[i]*3;
        }
        else {
            ans+=arr[i]*4;
        }
        count++;
       }
        return ans;
    }
}