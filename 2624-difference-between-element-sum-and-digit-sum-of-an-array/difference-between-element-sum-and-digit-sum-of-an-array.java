class Solution {
    public int differenceOfSum(int[] nums) {
        int i=0,sum=0,tot=0;
        while(i<nums.length)  
        {
            sum+=nums[i];
            int a=nums[i];
            while(a>0)
            {
            tot+=a%10;
            a=a/10;
            }
            i++;
        }
        return Math.abs(sum-tot);
    }
}