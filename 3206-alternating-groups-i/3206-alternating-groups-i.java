class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int grp=0;
        int start=0;
        int n=colors.length;
        int count=0;
        int count2=0;
        while(count2<n){
         start=(start+1)%n;
         int first1=colors[start];
        int second2=colors[(start+1)%n];
        int third3=colors[(start+2)%n];
         if(first1==0&&second2==1&& third3==0){
            grp++;
        }
        else if(first1==1&&second2==0&& third3==1){
            grp++;
        }
          count2++;
        }
        
        return grp;
    }
}