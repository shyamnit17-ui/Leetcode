class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String text = words[i];
            boolean result = text.indexOf(x) != -1; // Returns true
            if(result==true){
                list.add(i);
            }
        }
        return list;
    }
}