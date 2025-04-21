class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] res=new int[n*(n+1)/2];
        int i=0,z=0;
        while(i<=nums.length-1)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {

                sum+=nums[j];
                if(z<res.length)
                {
                    res[z++]=sum;
                }
            }
            i++;
        }
        Arrays.sort(res);
        int sum=0;
        for(int q=left-1;q<right;q++)
        {
            sum=(sum+res[q])%1000000007;
        }
        return sum;

    }
}