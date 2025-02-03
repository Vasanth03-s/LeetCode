class Solution {
    public boolean canAliceWin(int n) {
        int lim=10;
        boolean flag=true;
        if(n<10)
        {
            return false;
        }
        while(n>=lim)
        {
            n=n-lim;
            lim--;
            flag=!flag;
            if(n<lim)
            {
                break;
            }
        }
        return !flag;
        
    }
}