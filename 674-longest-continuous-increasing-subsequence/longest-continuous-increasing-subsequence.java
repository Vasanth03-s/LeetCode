class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int curi=1;
        int maxl=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                curi++;
                maxl=Math.max(curi,maxl);
            }
            else
            {
                curi=1;
            }
        }
        return maxl;
    }
}