class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char y=s.charAt(i);
            if(letter==y)
            {
                count++;
            }
        }
        double occ=((double)count/s.length())*100;
        return (int)occ;
    }
}