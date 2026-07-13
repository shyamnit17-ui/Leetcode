class Solution {
    public static int getquantity(int currinc){
        return currinc*10+1;
    }
    public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> list = new ArrayList<>();
   int count = 0;
   int lowside = low;
   while (lowside > 0) {
    count++;
    lowside /= 10;
    }
  int first=0;
  int i=1;
  int digcount=count;
  while(count>0){
    first=first*10 +i;
    i++;
    count--;
  }
  if(first>=low && first<=high){
      list.add(first);
  }
  //quantity to be added 
 int quantity=0;
  while(digcount>0){
    quantity=quantity*10+1;
    digcount--;
  }
    int element=first;
    while(element<=high){
        if(element%10!=9){
            element=element+quantity;
            if(element>=low && element<=high){
                 list.add(element);
            }
        }
        else{
            quantity=getquantity(quantity);
            first=first*10+(first%10+1);
            element=first;
             if(first>=low && first<=high){
                list.add(first);
             }
        }
    }
        return list;
    }
}