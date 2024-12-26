class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder ans=new StringBuilder();
        for(String i:words)
        {
            ans.append(i);
            if(s.equals(ans.toString()))
            {
                return true;
            }
            if(ans.length()>s.length())
            {
                return false;
            }
        }
        return false;
    }
}