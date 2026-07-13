class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String current= details[i];
            int age = (int)(current.charAt(11)-'0')*10;
            age=age+ (int)(current.charAt(12)-'0');
            if(age>60){
                count++;
            }
        }
        return count;
    }
}