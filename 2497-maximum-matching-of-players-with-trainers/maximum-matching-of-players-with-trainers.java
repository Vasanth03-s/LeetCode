class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        int i=0;
        int j=0;
        int count=0;
        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j])
            {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}