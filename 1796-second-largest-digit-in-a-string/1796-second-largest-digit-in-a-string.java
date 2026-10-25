class Solution {
    public int secondHighest(String s) {
        int large=-1;
        int seclarge=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'<10 && s.charAt(i)-'0'>=0){
                if(large<s.charAt(i)-'0'){
                   seclarge=large; 
                   large=(s.charAt(i)-'0');
                    
                }
                else if(seclarge<s.charAt(i)-'0'&& s.charAt(i)-'0'<large){
                    seclarge=s.charAt(i)-'0';
                }
            }
        }
        if(large==seclarge){
            return -1;
        }
        return seclarge;
    }
}