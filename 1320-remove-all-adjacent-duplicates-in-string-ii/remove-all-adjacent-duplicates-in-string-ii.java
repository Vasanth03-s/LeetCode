class pair{
    char ch;
    int count;
    pair(char ch,int count)
    {
        this.ch=ch;
        this.count=count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> st=new Stack<>();
        StringBuilder b=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch==c)
            {
                st.peek().count++;
                if(st.peek().count==k)
                {
                    st.pop();
                }
            }
            else
            {
                st.push(new pair(c,1));
            }
        }
        for(pair p:st)
        {
            for(int i=0;i<p.count;i++)
            {
                b.append(p.ch);
            }
        }
        return b.toString();
    }
}