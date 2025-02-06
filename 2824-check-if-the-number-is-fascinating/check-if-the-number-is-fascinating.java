class Solution {
    public boolean isFascinating(int n) {
        HashSet<Character> arr=new HashSet<>();
        String s=String.valueOf(n);
        int a=2*n;
        int b=3*n;
        String res=s+a+b;
        if(res.length()!=9)
        {
            return false;
        }
        for(char c:res.toCharArray())
        {
            if(c>='1' && c<='9')
            {
                arr.add(c);
            }
            else if(c=='0')
            {
                return false;
            }
        }
        return arr.size()==9;
    }
}