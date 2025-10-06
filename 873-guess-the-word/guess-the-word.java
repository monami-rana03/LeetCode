/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {
        int guess = 0;
        int last = words.length - 1;
        while (guess != 6) {
            guess = master.guess(words[0]);
            int index = 1;
            while (index <= last) {
                int count = matches(words[0], words[index]);
                if (count == guess) {
                    index++;
                } else {
                    words[index] = words[last];
                    last--;
                }
            }
            words[0] = words[last];
            last--;
        }
    }

    private int matches(String word1, String word2) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}