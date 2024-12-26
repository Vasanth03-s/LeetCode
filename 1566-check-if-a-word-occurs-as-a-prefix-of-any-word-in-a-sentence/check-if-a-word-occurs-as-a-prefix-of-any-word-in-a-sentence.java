class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split("\\s+");
        int count=0;
        for(String i:arr)
        {
            count++;
            if(i.startsWith(searchWord))
            {
                return count;
            }
        }
        return -1;
        
    }
}