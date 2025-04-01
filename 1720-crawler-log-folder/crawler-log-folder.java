class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        
        for (String log : logs) {
            if (log.equals("../")) {
                if (count > 0) count--; // Move up only if we're not at the root
            } else if (!log.equals("./")) {
                count++; // Move deeper for any valid folder name
            }
        }
        
        return count;
    }
}