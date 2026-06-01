class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length==0) return;
       int n=board.length;
       int m=board[0].length;
       for(int i=0;i<n;i++){
        dfs(board,i,0);
        dfs(board,i,m-1);
       } 
       for(int j=0;j<m;j++){
        dfs(board,0,j);
        dfs(board,n-1,j);
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }else if(board[i][j]=='#'){
                board[i][j]='O';
            }
        }
       }
    }
    private void dfs(char[][] mat,int r,int c){
        int n=mat.length;
        int m=mat[0].length;
        if(r<0 || c<0 || r>=n || c>=m || mat[r][c]!='O'){
            return;
        }
        mat[r][c]='#';
        dfs(mat,r+1,c);
        dfs(mat,r-1,c);
        dfs(mat,r,c+1);
        dfs(mat,r,c-1);
    }
}