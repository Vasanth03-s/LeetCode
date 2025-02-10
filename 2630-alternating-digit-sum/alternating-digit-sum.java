class Solution {
    public int alternateDigitSum(int n) {
        String h=String.valueOf(n);
        int sum=0,dig=1;
        for(int i=0;i<h.length();i++)
        {
            int a=h.charAt(i)-'0';
            sum=sum+(a*dig);
            dig*=-1;
        }
        return sum;
    }
}