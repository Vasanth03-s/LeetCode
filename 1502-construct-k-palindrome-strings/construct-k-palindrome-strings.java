class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character,Integer> ans=new HashMap<>();
        int count=0;
        if(s.length()<k)
        {
            return false;
        }
        for(char c:s.toCharArray())
        {
            if(c!=' ')
            {
                ans.put(c,ans.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> e:ans.entrySet())
        {
            int a=e.getKey();
            int b=e.getValue();
            if(b%2!=0)
            {
                count++;
            }
        }
        if(count>k)
        {
            return false;
        }
        return true;
        
    }
}