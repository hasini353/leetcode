class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int tem=0;
            for(int j=i;j<n;j++){
                tem += (nums[j]==target) ? 1 : -1;
                if(tem>0) cnt++;
            }
        }
        return cnt;
    }
}