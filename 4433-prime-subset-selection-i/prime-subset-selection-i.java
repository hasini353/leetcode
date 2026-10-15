class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> res=new ArrayList<>();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(prime(i)){
                if(sum+i>s)break;
              sum+=i; 
              res.add(i);
            }
        }
        return res;
    }
    private boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}