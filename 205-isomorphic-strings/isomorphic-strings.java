class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
		    char c1=s.charAt(i);
		    char c2=t.charAt(i);
		    if(hp.containsKey(c1))
		    {
		        if(hp.get(c1)!=c2)
		        {
		        return false;
		        }
		    }
		    else if(hp.containsValue(c2))
		    {
		        return false;
		    }
		    hp.put(c1,c2);
		}
		return true;
    }
}