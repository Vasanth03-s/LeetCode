class Solution {
    public int findNumbers(int[] nums) {
        int x=0,a=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            int y=nums[i];
            while(y>0)
            {
               a=y%10;
               x++;
               y=y/10; 
            }
            if(x%2==0)
            {
                count++;
            }
            x=0;
        }
        return count;

        
    }
}