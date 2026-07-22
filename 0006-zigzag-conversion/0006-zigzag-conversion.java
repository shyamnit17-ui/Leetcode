class Solution {
    public String convert(String s, int numRows) {
       StringBuilder[]st=new StringBuilder[numRows];
       int currRow=0;
       boolean goingDown=true;
       if(numRows==1){
        return s;
       }
       for(int i=0;i<numRows;i++){
         st[i]=new StringBuilder();
       }
        for(int i=0;i<s.length();i++){ 
         st[currRow].append(s.charAt(i)); 
          if(currRow==0){ 
             goingDown=true;
             currRow++;
          }
          else if(currRow==numRows-1){
            goingDown=false;
            currRow--;
          }
          else{
            if(goingDown==true){
               currRow++; 
            }
            else{
              currRow--;
            }
          }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<st.length;i++){
            sb.append(st[i]);
        }
        return sb.toString();
    }
}