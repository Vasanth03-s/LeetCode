class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=releaseTimes[0];
        char slow=keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++)
        {
            int curr=releaseTimes[i]-releaseTimes[i-1];

            if(curr>max || curr==max && keysPressed.charAt(i)>slow)
            {
                max=curr;
                slow=keysPressed.charAt(i);
            }
        }
        return slow;
        
    }
}