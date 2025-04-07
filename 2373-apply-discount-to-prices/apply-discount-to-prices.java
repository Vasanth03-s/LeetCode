class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] arr=sentence.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            if(word.matches("\\$\\d+(\\.\\d{1,2})?"))
            {
                try{
                double x=Double.parseDouble(word.substring(1));
                double discounted = x * (1 - discount / 100.0);
                String f = String.format("$%.2f", discounted);
                ans.append(f);
                }
                catch(NumberFormatException e)
                {
                    ans.append(word);
                }
            }
            else {
                ans.append(word);
            }
            if(i!=arr.length-1)
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}