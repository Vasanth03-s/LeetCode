class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s== null || s.isEmpty())
        {
            return false;
        }
        Map<Character,Integer> a=new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                a.put(c,a.getOrDefault(c,0)+1);
            }
        }
        int freq=-1;
        boolean allequal=true;
        for(int i:a.values())
        {
            if(freq == -1)
        {
            freq=i;
        }
        else if(i!=freq)
        {
            allequal=false;
        }
        }
        if(allequal)
        {
            return true;
        }
        return false;
        
    }
}