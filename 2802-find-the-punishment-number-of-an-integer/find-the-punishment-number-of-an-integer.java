class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int sq=i*i;
            if(pefsqr(String.valueOf(sq),i,0)){
                ans+=sq;
            }
        }
        return ans;
    }
    private boolean pefsqr(String s,int a,int ind){
        if(ind==s.length()){
            return a==0;
        }
        int n=0;
        for(int i=ind;i<s.length();i++){
            n=n*10+(s.charAt(i)-'0');
            if(n<=a){
                if(pefsqr(s,a-n,i+1)){
                    return true;
                }
            }
        }
        return false;
    }
}