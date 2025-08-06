class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
		char[] res=pattern.toCharArray();
		if(arr.length!=res.length)
		{
		    return false;
		}
		HashMap<Character,String> hp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		    if(hp.containsKey(res[i]))
		    {
		        if(!hp.get(res[i]).equals(arr[i]))
		        {
		            return false;
		        }
		    }
		    else if(hp.containsValue(arr[i]))
		    {
		        return false;
		    }
		    hp.put(res[i],arr[i]);
		}
		return true;
    }
}