class Solution {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums[0]) {
            set.add(n);
        }
        for (int i = 1; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int n : nums[i]) {
                if (set.contains(n)) {
                    temp.add(n);
                }
            }
            set = temp;
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}