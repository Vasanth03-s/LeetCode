class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0;
        ArrayList<Integer> set=new ArrayList<>();
        for(int i=0;i<sentences.length;i++)
        {
            String[] words=sentences[i].split("\\s+");
            a= words.length;
            set.add(a);
        }
        int b= Collections.max(set);
        return b;
    }
}