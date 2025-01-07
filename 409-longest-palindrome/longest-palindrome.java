class Solution {
    public int longestPalindrome(String s) {
        int[] ans=new int[128];
        for(char c:s.toCharArray())
        {
            ans[c]++;
        }
        int result=0;
        for(Integer cc:ans)
        {
            result+=cc/2*2;
            if(result%2==0 && cc%2==1)
            {
                result+=1;
            }
        }
        return result;
    }
}