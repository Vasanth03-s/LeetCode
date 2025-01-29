class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String ch:words)
        {
            char c=ch.charAt(0);
            sb.append(c);
        }
        if(sb.toString().equals(s))
        {
            return true;
        }
        return false;
    }
}