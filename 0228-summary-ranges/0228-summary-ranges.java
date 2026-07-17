class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int start=nums[0];
        int end=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                end=nums[i+1];
            }
            else{
                StringBuilder sb= new StringBuilder();
                if(start!=end){
                sb.append(start);
                sb.append('-');
                sb.append('>');
                sb.append(end); 
                }
                else{
                    sb.append(start);
                }
                list.add(sb.toString());
                start=nums[i+1];
                end=nums[i+1];
               
            }
        }
        StringBuilder sb= new StringBuilder();
        if(start==end){
          sb.append(start);
          list.add(sb.toString());
        }
        else{
               sb.append(start);
                sb.append('-');
                sb.append('>');
                sb.append(end); 
                list.add(sb.toString());
        }
        return list;
    }
}