class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        int n = nums.length;
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            char[] arr = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder(new String(arr));
            sb.reverse();
            int maxNum = Integer.parseInt(sb.toString());
            gain[i] = maxNum - nums[i];
        }
        Arrays.sort(gain);
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            if (gain[i] > 0) {
                sum += gain[i];
                k--;
            }
        }
        return sum;
    }
}