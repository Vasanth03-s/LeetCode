class Solution {
    public int subtractProductAndSum(int n) {
        int a=0,sum=0,pro=1;
        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            pro=pro*a;
            n=n/10;
        }
        return pro-sum;
        
    }
}