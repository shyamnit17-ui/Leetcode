class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
         HashMap<String, Integer> required = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
                required.put(words[i], required.getOrDefault(words[i], 0) + 1);
            }
        if (s.length() < words.length * words[0].length()) {
            return list;
        }
        for (int z = 0; z < words[0].length(); z++) {
            HashMap<String, Integer> current = new HashMap<>();
         
            int start = 0+z;
            int end = words.length * words[0].length()+z;
            if(end<=s.length()){
                    for (int m = start; m < end; m = m + words[0].length()) {
                String sb = s.substring(m, m + words[0].length());
                current.put(sb, current.getOrDefault(sb, 0) + 1);
            }
           
            if (required.equals(current)) {
                list.add(start);
            }
       
            while (end+words[0].length() <= s.length()) {
                String leaving = s.substring(start, start + words[0].length());
                current.put(leaving, current.getOrDefault(leaving, 0) - 1);
                if (current.getOrDefault(leaving, 0) == 0) {
                    current.remove(leaving);
                }
                start += words[0].length();
                String appending = s.substring(end, end + words[0].length());
                current.put(appending, current.getOrDefault(appending, 0) + 1);
                end += words[0].length();
                if (current.equals(required)) {
                    list.add(start);
                }
            }
            }
            current.clear();
        }
        return list;
    }
}