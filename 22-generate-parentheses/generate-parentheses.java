class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        dfs(res,new StringBuilder(),0,0,n);
        return res;
    }
    private void dfs(List<String> res,StringBuilder curr,int open,int close,int max){
        if(curr.length()==max*2){
            res.add(curr.toString());
            return;
        }
        if(open<max){
            curr.append('(');
            dfs(res,curr,open+1,close,max);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            dfs(res,curr,open,close+1,max);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}