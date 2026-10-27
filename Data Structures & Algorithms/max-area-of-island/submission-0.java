class Solution {
    int max=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    int curr=calculate(grid,i,j);
                    max=Math.max(max,curr);
                }
            }
        }
        return max;
    }
    public int calculate(int[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

        return 1+calculate(grid,i+1,j)+calculate(grid,i-1,j)+calculate(grid,i,j+1)+calculate(grid,i,j-1);
    }
}
