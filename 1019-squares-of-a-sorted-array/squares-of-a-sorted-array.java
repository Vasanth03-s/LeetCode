class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=(int)Math.pow(nums[i],2);
            res[i]=sum;
        }
        Arrays.sort(res);
        return res;
        
    }
}