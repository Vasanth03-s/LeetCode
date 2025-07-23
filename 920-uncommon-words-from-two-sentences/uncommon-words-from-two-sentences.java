class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      String[] str1=s1.split(" ");
		String[] str2=s2.split(" ");
		List<String> res=new ArrayList<>();
		HashMap<String,Integer> map=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		for(String h:str1)
		{
		    map.put(h,map.getOrDefault(h,0)+1);
		}
		for(String h:str2)
		{
		    map.put(h,map.getOrDefault(h,0)+1);
		}
		for(Map.Entry<String,Integer> q:map.entrySet())
		{
		    if(q.getValue()==1)
		    {
		       res.add(q.getKey());
		    }
		}
		String[] wan=new String[res.size()];
		for(int i=0;i<res.size();i++)
		{
		    wan[i]=res.get(i);
		}
        return wan;
    }
}