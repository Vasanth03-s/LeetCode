class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String splc="!@#$%^&*()-+";
        char prev='\0';
        boolean lc=false,uc=false,dig=false,spl=false,las=true;
        if(password.length()<8)
        {
            return false;
        }
        for(char c:password.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                lc=true;
            }
            if(Character.isUpperCase(c))
            {
                uc=true;
            }
            if(Character.isDigit(c))
            {
                dig=true;
            }
            if(splc.indexOf(c)!=-1)
            {
                spl=true;
            }
            if(c==prev)
            {
                las=false;
            }
            prev=c;
        } 
        return lc && uc && dig && las && spl;
    }
}