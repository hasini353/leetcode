class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        while(sum<=n){
           sum=a+b+c;
           a=b;
           b=c;
           c=a+b;
           if(sum==n){
            return true;
           }
        }
        return false;
    }
}