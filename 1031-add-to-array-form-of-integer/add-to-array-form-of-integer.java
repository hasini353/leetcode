class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=num.length-1;
        List<Integer> rs=new ArrayList<>();
        while(n>=0 || k>0){
             if(n>=0){
                k+=num[n];
                n--;
             }
             rs.add(k%10);
             k/=10;
        }
        Collections.reverse(rs);
        return rs;
    }
}