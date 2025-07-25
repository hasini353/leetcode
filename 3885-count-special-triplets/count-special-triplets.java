import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        Map<Integer, Integer> rightCount = new HashMap<>();
        Map<Integer, Integer> leftCount = new HashMap<>();

        for (int num : nums) {
            rightCount.put(num, rightCount.getOrDefault(num, 0) + 1);
        }

        long result = 0;

        for (int j = 0; j < n; j++) {
            int current = nums[j];
            rightCount.put(current, rightCount.get(current) - 1);
            int target = current * 2;
            int left = leftCount.getOrDefault(target, 0);
            int right = rightCount.getOrDefault(target, 0);
            result = (result + (long) left * right) % MOD;
            leftCount.put(current, leftCount.getOrDefault(current, 0) + 1);
        }

        return (int) result;
    }
}
