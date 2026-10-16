/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=1;
        int j=n;
      while(i>0&&j>0){
        int mid=i+(j-i)/2;
        int picked=guess(mid);
        if(picked==0){
            return mid;
        }
        else if(picked==1){
            i=mid+1;
        }
        else if(picked==-1){
            j=mid-1;
        }
      }
      return -1; 
    }
}