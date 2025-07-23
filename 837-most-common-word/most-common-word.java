class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> mp=new HashMap<>();
        Set<String> bs=new HashSet<>(Arrays.asList(banned));
	    int max=0;
	    String result="";
		String[] str = paragraph.toLowerCase().split("[^a-z]+");
		for(String s:str)
		{
		    if(!bs.contains(s) && s.length()>0)
		    {
		    mp.put(s,mp.getOrDefault(s,0)+1);
		    max=Math.max(max,mp.get(s));
		    }
		}
		for(Map.Entry<String,Integer> m:mp.entrySet())
		{
		   if(m.getValue()==max)
		   {
		       result=m.getKey();
		       break;
		   }
		}
		return result;

		
    }
}