class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean ip=false;
        for(char c:s.toCharArray())
        {
            if(c=='|')
            {
                ip=!ip;
            }
            else if(c=='*' && !ip)
            {
                count++;
            }
        }
        return count;
        
    }
}