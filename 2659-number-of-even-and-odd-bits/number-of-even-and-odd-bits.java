class Solution {
    public int[] evenOddBit(int n) {
        int even=0,odd=0;
        String res=Integer.toBinaryString(n);
        String ans=new StringBuilder(res).reverse().toString();
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)=='1')
            {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            }
        }
        return new int[]{even,odd};
    }
}