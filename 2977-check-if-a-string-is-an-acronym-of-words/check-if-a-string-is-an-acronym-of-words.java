class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
        {
            return false;
        }
        boolean flag=true;
        for(int i=0;i<words.size();i++)
        {
            if(words.get(i).charAt(0)!=s.charAt(i))
            {
                flag=false;
            }
        }
        return flag;
        
    }
}