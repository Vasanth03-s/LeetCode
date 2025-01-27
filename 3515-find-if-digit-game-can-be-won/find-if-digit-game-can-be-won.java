class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a<10)
            {
                sum+=a;
            }
            else
            {
                sum1+=a;
            }
        }
        return sum1!=sum;
    }
}