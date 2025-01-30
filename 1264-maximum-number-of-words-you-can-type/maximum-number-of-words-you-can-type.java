class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> map=new HashSet<>();
        for(char c:brokenLetters.toCharArray())
        {
            map.add(c);
        }
        String[] res=text.trim().split(" ");
        int count=0;
        for(String h:res)
        {
            boolean flag=true;
            for(char c:h.toCharArray())
            {
                if(map.contains(c))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
        
    }
}