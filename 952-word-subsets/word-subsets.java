import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        
        // Build the maximum frequency count for words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = getFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        // Check each word in words1
        for (String word : words1) {
            int[] freq = getFrequency(word);
            if (isUniversal(freq, maxFreq)) {
                ans.add(word);
            }
        }

        return ans;
    }

    // Helper method to compute character frequency
    private int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Helper method to check if a word satisfies the universal condition
    private boolean isUniversal(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
