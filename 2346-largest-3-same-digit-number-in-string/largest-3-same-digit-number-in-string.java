class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<String> a = new ArrayList<>(); // List to store good integers
        
        // Edge case for null or empty string
        if (num == null || num.isEmpty()) {
            return "";
        }

        // Iterate through the string to find good integers
        for (int i = 0; i < num.length() - 2; i++) {
            // Check if the current substring of length 3 consists of the same character
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                // Add the valid "good integer" substring
                a.add(num.substring(i, i + 3));
            }
        }

        // If no good integer is found, return an empty string
        if (a.isEmpty()) {
            return "";
        }

        // Return the lexicographically largest good integer
        return Collections.max(a);
    
    }
}