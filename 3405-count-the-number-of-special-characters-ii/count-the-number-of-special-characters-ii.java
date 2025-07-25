class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        int n = word.length();

        for (int i = 0; i < 26; i++) {
            lastLower[i] = -1;
            firstUpper[i] = n;
        }

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                lastLower[c - 'a'] = i;
            } else {
                if (firstUpper[c - 'A'] == n) {
                    firstUpper[c - 'A'] = i;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] != -1 && firstUpper[i] != n && lastLower[i] < firstUpper[i]) {
                count++;
            }
        }

        return count;
    }
}
