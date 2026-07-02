class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        long score = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            score += nums[i] + max;
            ans[i] = score;
        }
        return ans;
    }
}