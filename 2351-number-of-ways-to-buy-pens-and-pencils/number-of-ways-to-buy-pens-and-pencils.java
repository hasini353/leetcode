class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
      long w=0;
      for(int i=0;i*cost1<=total;i++){
        int r=total-i*cost1;
        int p=r/cost2;
        w+=(p+1);
      }
      return w;
        
    }
}