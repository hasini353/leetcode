class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int tem=n;
        int pro=1;
        while(tem>0){
            int dig= tem % 10;
            sum +=dig;
            pro *=dig;
            tem /= 10;
        }
        int tot=sum+pro;
        return n%tot==0;
    }
}