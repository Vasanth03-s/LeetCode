class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> dt=new HashMap<>();
        char cc='a';
        for(char c:key.toCharArray())
        {
            if(c!=' ' && !dt.containsKey(c))
            {
                dt.put(c,cc);
                cc++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:message.toCharArray())
        {
            if(c==' ')
            {
                ans.append(' ');
            }
            else
            {
                ans.append(dt.get(c));
            }
        }
        return ans.toString();
        
    }
}