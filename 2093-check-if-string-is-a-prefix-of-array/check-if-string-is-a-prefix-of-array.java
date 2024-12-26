class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();

        for (String word : words) {
            prefix.append(word);

            // Check if the current prefix matches the string
            if (prefix.toString().equals(s)) {
                return true;
            }

            // If the prefix exceeds the length of s, it's not a prefix
            if (prefix.length() > s.length()) {
                return false;
            }
        }

        // If we finish the loop without finding a match, return false
        return false;
    }
}
