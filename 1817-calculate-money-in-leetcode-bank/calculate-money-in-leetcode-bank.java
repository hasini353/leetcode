class Solution {
    public int totalMoney(int n) {
        int tot=0;
        int wek=n/7;
        int rem=n%7;
        for(int i=0;i<wek;i++){
            tot +=(28+i*7);
        }
        for(int i=0;i<rem;i++){
            tot +=((wek+1)+i);
        }
        return tot;
    }
}