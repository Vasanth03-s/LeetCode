class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal,count=0;
        while(xor!=0)
        {
            count+=xor&1;
            xor>>=1; 
        }
        return count;
    }
}