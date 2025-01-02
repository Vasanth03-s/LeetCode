class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isd(i))
            {
                a.add(i);
            }
        }
        return a;
    }
    public static boolean isd(int d)
    {
        int n=d;
        while(n>0)
        {
            int num=n%10;
            if(num==0 || d % num!=0) {
                return false;
            }
            n=n/10;
        }
        return true;
    }
        
    
}