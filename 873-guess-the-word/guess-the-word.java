/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] wordlist, Master master) {
        List<String> candidates = new ArrayList<>(Arrays.asList(wordlist));
        for (int attempt = 0; attempt < wordlist.length && !candidates.isEmpty(); attempt++) {
            String guess = findBestGuess(candidates);
            int matches = master.guess(guess);
            if (matches == 6) {
                return;
            }
            List<String> newCandidates = new ArrayList<>();
            for (String word : candidates) {
                if (countMatches(guess, word) == matches) {
                    newCandidates.add(word);
                }
            }
            candidates = newCandidates;
        }
    }
    private String findBestGuess(List<String> candidates) {
        if (candidates.size() <= 2) {
            return candidates.get(0);
        }
        String bestWord = null;
        int minMaxCount = Integer.MAX_VALUE;
        for (String word : candidates) {
            Map<Integer, Integer> countMap = new HashMap<>();
            for (String candidate : candidates) {
                int matches = countMatches(word, candidate);
                countMap.put(matches, countMap.getOrDefault(matches, 0) + 1);
            }
            int maxCount = 0;
            for (int count : countMap.values()) {
                maxCount = Math.max(maxCount, count);
            }
            if (maxCount < minMaxCount) {
                minMaxCount = maxCount;
                bestWord = word;
            }
        }
        return bestWord;
    }
    private int countMatches(String word1, String word2) {
        int matches = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }
}