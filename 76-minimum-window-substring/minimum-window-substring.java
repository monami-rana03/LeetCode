class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        int[] freq = new int[128]; // ASCII frequency
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char c = s.charAt(right);

            if (freq[c] > 0) {
                required--;
            }
            freq[c]--;
            right++;

            // Try to shrink window
            while (required == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lc = s.charAt(left);
                freq[lc]++;
                if (freq[lc] > 0) {
                    required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
