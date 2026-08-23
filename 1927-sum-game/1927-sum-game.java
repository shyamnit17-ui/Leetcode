class Solution {
    public boolean sumGame(String num) {
      
        int ctleft = 0;
        int sumleft = 0;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) == '?') {
               
                ctleft++;
            } else {
                sumleft += (int) (num.charAt(i) - '0');
            }
        }
        int ctright = 0;
        int sumright = 0;
        for (int i = num.length() / 2; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
               
                ctright++;
            } else {
                sumright += (int) (num.charAt(i) - '0');
            }
        }
        int x = sumleft - sumright;
        int y = ctleft - ctright;

        if (2*x+9*y==0) {
            return false;
        }
        return true;
    }
}