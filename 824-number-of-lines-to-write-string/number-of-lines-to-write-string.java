class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int curchar=0;
        int totalline=1;
        for(int i=0;i<s.length();i++)
        {
            int cwidth=widths[s.charAt(i)-'a'];
            if(curchar+cwidth>100)
            {
                totalline++;
                curchar=cwidth;
            }
            else
            {
                curchar+=cwidth;
            }
        }
        int[] result={totalline,curchar};
        return result;
    }
}