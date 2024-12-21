class Solution {
    public String capitalizeTitle(String title) {
        String[] s=title.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()<=2)
            {
                s[i] = s[i].toLowerCase();
            }
            else{
            s[i]=s[i].substring(0,1).toUpperCase()  + s[i].substring(1).toLowerCase();
            }
        }
        String ans=String.join(" ",s);
        return ans;
        
    }
}