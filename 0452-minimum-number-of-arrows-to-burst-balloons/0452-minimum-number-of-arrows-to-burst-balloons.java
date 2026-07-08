class Solution {
    public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
       int arrows=0;
       int shootingrangestart=points[0][0];
       int shootingrangeend=points[0][1];
       for(int i=0;i<points.length-1;i++){
          int nextstart=points[i+1][0];
          int nextend=points[i+1][1];
          if(shootingrangeend<nextstart){
             arrows++;
             shootingrangestart=nextstart;
             shootingrangeend=nextend;
          }
          else{
            shootingrangestart=nextstart; 
            if(nextend<shootingrangeend){
                 shootingrangeend=nextend;
            }
          }
       }
       return arrows+1;
    }
}