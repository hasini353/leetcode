class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] v=new boolean[n][m];
        int r=0,c=0;
        v[r][c]=true;
        while(true){
            int nr=r;
            int nc=c;
            if(grid[r][c]=='L'){
                nc--;
            }else if(grid[r][c]=='R'){
                nc++;
            }else if(grid[r][c]=='U'){
                nr--;
            }else if(grid[r][c]=='D'){
                nr++;
            }
            if(nr<0 || nr>=n || nc<0 || nc>=m || v[nr][nc]){
                break;
            }
            r=nr;
            c=nc;
            v[r][c]=true;
        } 
        return new int[]{r,c};
    }
}