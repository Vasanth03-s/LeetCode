class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int max1=nums[0]*nums[1];;
        int max2=nums[nums.length-2]*nums[nums.length-1];
        return max2-max1;
        
    }
}