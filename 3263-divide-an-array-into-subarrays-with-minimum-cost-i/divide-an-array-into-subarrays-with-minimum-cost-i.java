class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int cos=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                int demo=nums[0]+nums[i]+nums[j];
                cos=Math.min(cos,demo);
            }
        }
        return cos;
    }
}