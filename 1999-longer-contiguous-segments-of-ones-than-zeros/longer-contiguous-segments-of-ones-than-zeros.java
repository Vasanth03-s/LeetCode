class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0,two=0,mone=0,lone=0;
        for(int i:s.toCharArray())
        {
            if(i=='1')
            {
                one++;
                mone=Math.max(one,mone);
                two=0;
            }
            else
            {
                two++;
                lone=Math.max(lone,two);
                one=0;
            }
        }
        return mone>lone;
        
    }
}