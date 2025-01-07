class Solution {
    public String reverseWords(String s) {
       StringBuilder e=new StringBuilder();
        String[] arr=s.split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            String h=new StringBuilder(arr[i]).reverse().toString();
            e.append(h);
            if(i<arr.length-1)
            {
                e.append(" ");
            }
        }
        return e.toString(); 
        
    }
}