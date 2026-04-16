class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int v=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int d=Math.abs(i-start);
                v=Math.min(d,v);
            }
        }
        return v;
    }
}