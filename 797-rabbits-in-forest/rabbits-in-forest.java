import java.util.*;

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int ans : answers) {
            countMap.put(ans, countMap.getOrDefault(ans, 0) + 1);
        }

        int total = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int x = entry.getKey();
            int count = entry.getValue();
            int groupSize = x + 1;
            int groups = (count + x) / groupSize;
            total += groups * groupSize;
        }

        return total;
    }
}
