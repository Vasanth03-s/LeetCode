class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            char k=words[i].charAt(0);
            char s=words[i].charAt(words[i].length()-1);
            if((k=='a'||k=='e'||k=='i'||k=='o'||k=='u') && (s=='a'||s=='e'||s=='i'||s=='o'||s=='u'))
            {
                count++;
            }
        }
        return count;
        
    }
}