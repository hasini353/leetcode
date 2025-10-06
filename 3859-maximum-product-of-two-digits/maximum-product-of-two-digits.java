class Solution {
    public int maxProduct(int n) {
        int fir=-1;
        int sec=-1;
        while(n>0){
            int dig=n%10;
            n/=10;
            if(dig>fir){
                sec=fir;
                fir=dig;
            }else if(dig>sec) sec=dig;
        }
        if(fir==-1 || sec==-1) return -1;
        return fir*sec;
    }
}