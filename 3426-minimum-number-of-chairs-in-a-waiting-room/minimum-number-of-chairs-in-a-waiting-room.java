class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int max=0;
        for(char c:s.toCharArray())
        {
            if(c=='E')
            {
                count++;
            }
            else{
                count--;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
        
    }
}