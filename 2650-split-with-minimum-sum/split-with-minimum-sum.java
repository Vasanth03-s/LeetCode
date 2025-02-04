class Solution {
    public int splitNum(int num) {
        String y=String.valueOf(num);
        int n=y.length();
        int[] arr=new int[n];
        int j=0;
        while(num>0)
        {
            arr[j++]=num%10;
            num/=10;
        }
        int num1=0,num2=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                num1=num1*10+arr[i];
            }
            else
            {
                num2=num2*10+arr[i];
            }
        }
        return num1+num2;
    }
}