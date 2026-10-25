class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int inf=Integer.MAX_VALUE;
        int[][] visited=new int[grid.length][grid[0].length];
        int[][] coords={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> q= new LinkedList<>();
        int level=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                visited[row][col]=1;
                for(int[] coord:coords){
                    int newRow=coord[0]+row;
                    int newCol=coord[1]+col;
                    if(newRow>=0 && newRow<grid.length &&
                       newCol>=0 && newCol<grid[0].length && 
                       visited[newRow][newCol]==0 && grid[newRow][newCol]==inf){
                        grid[newRow][newCol]=level;
                        q.add(new int[]{newRow,newCol});
                        visited[newRow][newCol]=1;
                    }
                }

            }
            level++;
        }
    }
}
