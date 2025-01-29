class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            int dif=nums[j]-nums[i];
            if (dif > 0) {
                    max=Math.max(dif,max); 
                }
            }
        }
        return max;
    }
}