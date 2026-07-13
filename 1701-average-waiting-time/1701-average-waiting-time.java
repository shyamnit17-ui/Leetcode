class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg=0;
        
      long endingtime=  customers[0][0]+customers[0][1];
      long waiting= endingtime-customers[0][0];
      long netwaiting=waiting;
      for(int i=1;i<customers.length;i++){
        if(customers[i][0]<endingtime){
         endingtime+=customers[i][1];
        }
        else{
         endingtime=customers[i][0]+customers[i][1];
        } 
        waiting=endingtime-customers[i][0];
        netwaiting+=waiting;
      }
    avg=(double)netwaiting/customers.length;
    return avg;
    }
}