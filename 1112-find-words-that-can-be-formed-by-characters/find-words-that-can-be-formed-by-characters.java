class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr=new int[26];
        int tc=0;
        for(char s:chars.toCharArray())
        {
            arr[s-'a']++;
        }
        for(String w:words)
        {
            int[] temp=arr.clone();
            boolean can=true;
            for(int c:w.toCharArray())
            {
                if(temp[c-'a']>0)
                {
                    temp[c-'a']--;
                }
                else {
                    can=false;
                    break;
                }
            }
            if(can)
            {
                tc+=w.length();
            }
        }
        return tc;
        
    }
}