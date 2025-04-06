class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int result = 0;
        int numSubsets = 1 << n;

        for (int mask = 0; mask < numSubsets; mask++) {
            int xorSum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xorSum ^= nums[i];
                }
            }
            result += xorSum;
        }

        return result;
    }
}
