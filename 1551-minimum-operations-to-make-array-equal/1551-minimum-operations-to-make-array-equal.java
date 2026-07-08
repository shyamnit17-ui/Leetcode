class Solution {
    public int minOperations(int n) {
        
        // variable = (condition) ? value_if_true : value_if_false;
      return n%2==0 ? (n*n)/4 : (n-1)/2*((n-1)/2+1);
    }
}