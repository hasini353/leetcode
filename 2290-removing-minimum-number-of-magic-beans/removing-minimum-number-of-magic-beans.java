class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);

        int n = beans.length;
        long total = 0;

        for (int bean : beans) {
            total += bean;
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long keep = (long) beans[i] * (n - i);
            ans = Math.min(ans, total - keep);
        }

        return ans;
    }
}