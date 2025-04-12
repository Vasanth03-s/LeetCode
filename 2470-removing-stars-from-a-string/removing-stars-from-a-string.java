class Solution {
    public String removeStars(String s) {
        StringBuilder res=new StringBuilder();
        Stack<Character> arr=new Stack<>();
        for(char c:s.toCharArray())
        {

                if(c=='*')
                {
                    if(!arr.isEmpty())
                    {
                    arr.pop();
                    }
            }
            else {
                arr.push(c);
            }
        }
        for(char c:arr)
        {
            res.append(c);
        }
        return res.toString();
    }
}