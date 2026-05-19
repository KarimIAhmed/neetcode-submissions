class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    queue.add(new int[]{i,j});
                }
            }
        }
        
        int distance=1;
        int[][] dirs={{0,1},{1,0},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int[] cell=queue.poll();
                for(int[] dir:dirs){
                    int currCellX=cell[0]+dir[0];
                    int currCellY=cell[1]+dir[1];
                    
                    if(currCellX<grid.length && currCellY<grid[0].length && currCellX>=0 && currCellY>=0 &&
                    grid[currCellX][currCellY]==Integer.MAX_VALUE){
                        grid[currCellX][currCellY]=distance;
                        queue.add(new int[]{currCellX,currCellY});
                    }
                }
            }
            distance++;
         }
    }
}
