class Solution {
    public static String getstr(int n,int lastplace,String sb, List<String> list ){
        if(n==0){
            list.add(sb);
            return sb;
        }
        if(lastplace==1){
            getstr(n-1,0,sb+"0",list);
        }

        return  getstr(n-1,1,sb+"1",list);
    }
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        getstr(n,1,"",list);
        return list;
    }
}