class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double winsum=0;
        double maxsum=0;
        for(int i=0;i<k;i++)
        { 
            winsum+=nums[i];
        }
        maxsum=winsum;
        for(int j=k;j<nums.length;j++)
        {
            winsum+=nums[j]-nums[j-k];
            maxsum=Math.max(maxsum,winsum);
        }
        return maxsum/k;  
    }
}