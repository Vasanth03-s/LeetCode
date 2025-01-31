class Solution {
    public boolean areNumbersAscending(String s) {
        String[] a=s.split(" ");
        int max=0;
        int curr=0;
        for(String h:a)
        {
            if(h.matches("\\d+"))
            {
                curr=Integer.parseInt(h);
                if(curr<=max)
                {
                    return false;
                }
                max=curr;
            }
        }
       return true;
        
    }
}