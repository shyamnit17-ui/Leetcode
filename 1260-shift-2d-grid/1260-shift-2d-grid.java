class Solution { 
    public void shiftright(int arr[]){
        int last= arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list= new ArrayList<>();
        int n=grid[0].length;
        int arr[]=new int[grid.length*(grid[0].length)];
        int idx=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
              arr[idx]=grid[i][j];
              idx++;
            }
        }
        for(int i=0;i<k;i++){
            shiftright(arr);
        } 
      for(int i=0;i<grid.length;i++){
        List<Integer> list2= new ArrayList<>();
        for(int j=0;j<grid[0].length;j++){
            list2.add(arr[j+i*n]);
        }
        list.add(list2);
      }
        return list;
    }
}