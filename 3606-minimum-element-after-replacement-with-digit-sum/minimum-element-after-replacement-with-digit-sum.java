class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        int c=0,sum=0;
        for(int b:nums)
        {
            sum=0;
            while(b!=0)
            {
                c=b%10;
                sum+=c;
                b=b/10;
            }
            a.add(sum);
        }
        int ans=Collections.min(a);
        return ans;
    }
}