class Solution {
    public int passThePillow(int n, int time) {
        int a=2*(n-1);
        int b=time%a;
        int dir=1;
        int pos=0;
        for(int i=0;i<=b;i++)
        {
            pos+=dir;
            if(pos==n)
            {
                dir=-1;
            }
            else if(pos==0)
            {
                dir=1;
            }
        }
        return pos;
        
    }
}