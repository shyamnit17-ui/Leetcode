class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        int count = 0;
        if (chars.length == 1) {
            return chars.length;
        }
        while (read < chars.length && write < chars.length) {
            char originalChar = chars[read];
            chars[write++] = originalChar;

            while (read < chars.length && chars[read] == originalChar) {
                count++;
                read++;
            }
            if (count >1) {
                if(count<10){
                    chars[write++] = (char) ('0' + count);
                }
                else{
                   char[] x= Integer.toString(count).toCharArray();
                   for(char c:x){
                    chars[write++]=c;
                   }
                }
            } 
            count = 0;
        }
        return write;
    }
}