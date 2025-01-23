class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr=sentence.split("\\s+");
        StringBuilder result=new StringBuilder();
        String suffix="ma";
        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            char firstc=arr[i].charAt(0);
            if(isvowel(firstc))
            {
                word=word+suffix;
            }
            else {
                word=word.substring(1)+firstc+suffix;
            }
            word+="a".repeat(i+1);
            result.append(word).append(" ");
        }
            return result.toString().trim();
    }
    public static boolean isvowel(char e) {
        return "aeiou".indexOf(Character.toLowerCase(e)) != -1;
    }

}