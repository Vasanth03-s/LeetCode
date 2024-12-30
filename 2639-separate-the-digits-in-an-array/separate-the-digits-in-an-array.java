class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int b=nums[i];
            while(b!=0)
            {
                temp.add(b%10);
                b=b/10;
            }
            for(int j=temp.size()-1;j>=0;j--)
            {
                ans.add(temp.get(j));
            }
        }
        int[] arr=ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;
        
    }
}