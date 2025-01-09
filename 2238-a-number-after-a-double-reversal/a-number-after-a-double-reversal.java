class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0)
        {
            return true;
        }
        String u=String.valueOf(num);
        String h=new StringBuilder(u).reverse().toString();
        int flag=0;
        for(int i=0;i<h.length();i++)
        {
            if(h.charAt(i)!='0')
            {
                flag=i;
                break;
            }
        }

        String t=h.substring(flag);
        String ans=new StringBuilder(t).reverse().toString();
        int y=Integer.parseInt(ans);
        if(y==num) {
            return true;
        }
        return false;

        
    }
}