class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int sum=0,ans=0;
        for(char i:s.toCharArray())
        {
            sb.append(i-'a'+1);
        }
        for(char c:sb.toString().toCharArray())
        {
            sum+=c-'0';
        }
        while(--k>0)
        {
            ans=0;
            while(sum>0)
            {
                ans=ans+sum%10;
                sum/=10;
            }
            sum=ans;
        }
        return sum;
        
    }
}