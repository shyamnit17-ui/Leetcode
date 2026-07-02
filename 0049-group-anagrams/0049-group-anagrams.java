class Solution {
    private String generateFingerprint(String s){
        int arr[]=new int[26];
       
        StringBuilder sb = new StringBuilder("");
         for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                sb.append((char)(i+'a'));
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> stres= new HashMap<>();
        for(int i=0;i<strs.length;i++){
        String key= generateFingerprint(strs[i]);
        if(!stres.containsKey(key)){
            List<String> sl= new ArrayList<>();
             stres.put(key,sl);
             sl.add(strs[i]);
         }
         else{
            stres.get(key).add(strs[i]);
         } 
        } 
       List<List<String>> valuesOnly = new ArrayList<>(stres.values());
        return valuesOnly;
    }
}