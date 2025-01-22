class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> a=new HashSet();
        for(char c:s.toCharArray())
        {
            a.add(c);
        }
        return a.size();
        
    }
}