class Solution {
    public boolean checkRecord(String s) {
        int p=0,a=0,l=0;
        if(s.contains("LLL"))
        {
            return false;
        }
        for(char c:s.toCharArray())
        {
            if(c=='P')
            {
                p++;
            }
            if(c=='A')
            {
                a++;
            }
        }
        if(a<2)
        {
            return true;
        }
        return false;
    }
}