class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int s=n;
        int res=0;
        while(s>0){
          int  v=s%10;
            r=r*10+v;
             s=s/10;
        } 
        int mn=Math.min(r,n);
        int mx=Math.max(r,n);
        for(int i=mn;i<=mx;i++){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                res+=i;
            }
        }
        return res;
    }
}