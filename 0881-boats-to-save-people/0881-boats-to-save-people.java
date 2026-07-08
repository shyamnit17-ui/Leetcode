class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int countb=0;
        int right = people.length-1;
        int left=0;
       while(left<=right){
         if(people[left]+people[right]>limit){
            countb++;
            right--;
         }
         else{
            countb++;
            right--;
            left++;
         }
        }
        return countb;
    }
}