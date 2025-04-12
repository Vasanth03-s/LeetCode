class Solution {
    public boolean backspaceCompare(String s, String t) {
        String b=rg(s);
        String c=rg(t);
        if(b.equals(c))
        {
           return true;
        }
        return false;
    }
    public static String rg(String a)
    {
        StringBuilder res=new StringBuilder();
        Stack<Character> arr=new Stack<>();
        for(char c:a.toCharArray())
        {
           
                if(c=='#')
                {
                     if(!arr.isEmpty())
                     {
                    arr.pop();
                     }
            }
            else {
                arr.push(c);
            }
        }
        for(char c:arr)
        {
            res.append(c);
        }
        return res.toString();
    }
}
