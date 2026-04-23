class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] v=new boolean[n];
        int p=0;
        for(int i=0;i<n;i++){
            if(!v[i]){
                dfs(isConnected,v,i);
                p++;
            }
        }
        return p;
    }
    private void dfs(int[][] isc,boolean[] v,int c){
        v[c]=true;
        for(int i=0;i<isc.length;i++){
            if(isc[c][i]==1 && !v[i]){
              dfs(isc,v,i);
            }
        }
    }

}