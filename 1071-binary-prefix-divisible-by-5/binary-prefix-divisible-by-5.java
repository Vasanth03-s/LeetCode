class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> arr=new ArrayList<>();
        int x=0;
        for(int num:nums)
        {
            x=(x<<1|num)%5;
            arr.add(x==0);
        }
        return arr;
    }
}