class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
                count++;
                sum=sum+nums[i];
            }
        }
        return count==0?0:sum/count;
        
    }
}