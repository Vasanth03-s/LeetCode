class Solution {
    public int numberOfChild(int n, int k) {
        int a=2*(n-1);
        int b=k%a;
        int dir=1;
        int pos=0;
        for(int i=0;i<b;i++)
        {
            pos+=dir;
            if(pos==n-1)
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