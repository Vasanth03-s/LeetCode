class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<String> a = new ArrayList<>(); 
        if(num == null || num.length() < 3)
        {
            return num;
        }
            String ans="";
            for(int i=0;i<num.length()-2;i++)
            {
                if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2))
                {
                        a.add(num.substring(i,i+3));
                }
            }
            if(a.isEmpty())
            {
                return "";
            }
            return Collections.max(a);
        
        
    }
}