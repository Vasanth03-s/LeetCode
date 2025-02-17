class Solution {
    public int getWinner(int[] arr, int k) {
        int count=0;
        int temp=arr[0];
        if(k>arr.length)
        {
            Arrays.sort(arr);
           return arr[arr.length-1];
        }
        for(int i=1;i<arr.length;i++)
        {
            if(temp<arr[i])
            {
                count=0;
                temp=arr[i];
            }
            count++;
            if(count==k)
            {
                return temp;
            }
        }
       Arrays.sort(arr);
           return arr[arr.length-1];
        
    }
}