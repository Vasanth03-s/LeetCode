class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String rev=new StringBuilder(words[i]).reverse().toString();
            if(words[i].equals(rev))
            {
                return words[i];
            }
        }
        return "";
        
    }
}