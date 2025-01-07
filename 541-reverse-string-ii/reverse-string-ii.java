class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder d=new StringBuilder();
        for(int i=0;i<s.length();i+=2*k)
        {
            int end=Math.min(i+k,s.length());
            String p1=new StringBuilder(s.substring(i,end)).reverse().toString();
            d.append(p1);
            int sn=end;
            end=Math.min(i+2*k,s.length());
            d.append(s.substring(sn,end));
        }
        return d.toString();


        
    }
}