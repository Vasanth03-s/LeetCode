class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result=new int[nums.length+nums.length];
        System.arraycopy(nums,0,result,0,nums.length);
        System.arraycopy(nums,0,result,nums.length,nums.length);
        return result;
        
    }
}