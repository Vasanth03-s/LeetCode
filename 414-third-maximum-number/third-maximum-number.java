class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
        {
            return nums[nums.length-1];
        }
        int max=nums[nums.length-1];
        Integer tl=null,sl=null;
        boolean tlf=false;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] != max&& sl==null)
            {
                sl=nums[i];
            }
            else if(nums[i] != max && nums[i] != sl && tl==null)
            {
                tl=nums[i];
                tlf=true;
            }
        }
        return tlf?tl:max;
        
    }
}