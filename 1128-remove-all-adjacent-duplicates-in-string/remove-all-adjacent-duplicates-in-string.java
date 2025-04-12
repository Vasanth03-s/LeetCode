class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> arr=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!arr.isEmpty() && c==arr.peek()) {
                arr.pop();
            }
            else{
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