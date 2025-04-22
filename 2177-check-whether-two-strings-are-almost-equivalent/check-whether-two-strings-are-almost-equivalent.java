class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
       HashMap<Character,Integer> res=new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            char c=word1.charAt(i);
            res.put(c,res.getOrDefault(c,0)+1);
        }
        for(int i=0;i<word2.length();i++)
        {
            char c=word2.charAt(i);
            res.put(c,res.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer> d:res.entrySet())
        {
            if (Math.abs(d.getValue())>3){
                return false;
            }
        }
        return true;
    }
}