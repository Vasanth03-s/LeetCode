class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        int k=0;
        for (int num:nums) {
            if (num>0) {
                seen.add(0,num);
                k=0;
            } else if (num==-1) {
                k++;
                if (k<=seen.size()) {
                    ans.add(seen.get(k-1));
                } 
                else{
                    ans.add(-1);
                }
            }
        }
        return ans;
        
    }
}