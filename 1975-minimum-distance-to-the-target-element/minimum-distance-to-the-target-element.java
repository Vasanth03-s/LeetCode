class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=1000;
        if(nums.length<=1)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans = Math.min(ans, Math.abs(i - start));
            }
        }
        return ans;
    }
}