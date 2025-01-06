class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a!=0){
            if(a>0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
            }
        }
        return pos>neg?pos:neg;
        
    }
}