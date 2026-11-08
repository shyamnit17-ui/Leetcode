class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        int server=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                    boolean bool=false;
                    boolean bool2=false;
                    //row
                    for(int m=0;m<grid[0].length;m++){
                        if(m==j){
                            continue;
                        }
                        else{
                            if(grid[i][m]==1){
                              bool= true;
                            }
                        }
                    }
                    for(int l=0;l<grid.length;l++){
                        if(l==i){
                            continue;
                        }
                        else{
                            if(grid[l][j]==1){
                                bool2=true;
                            }
                        }
                    }
                    if(bool==false&&bool2==false){
                        server++;
                    }
                }
            }  
        }
        return count-server;
    }
}