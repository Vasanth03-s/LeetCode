class Solution {
    public int dayOfYear(String date) {
        int sum=0;
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        String year=date.substring(0,4);
        int years=Integer.parseInt(year);
        String mon=date.substring(5,7);
        int mons=Integer.parseInt(mon);
        String day=date.substring(8);
        int days=Integer.parseInt(day);
        if(isleap(years))
            {
                months[1]=29;
            }
        for(int i=0;i<mons-1;i++)
        {
            sum+=months[i];    
        }
        sum+=days;
        return sum;
    }
    public static boolean isleap(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
    
}