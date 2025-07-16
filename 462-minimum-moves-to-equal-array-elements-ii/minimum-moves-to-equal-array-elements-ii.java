class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int md=nums[n/2];
        int m=0;
        for(int na:nums)
        {
            m+=Math.abs(na-md);
        }
        return m;
    }
}