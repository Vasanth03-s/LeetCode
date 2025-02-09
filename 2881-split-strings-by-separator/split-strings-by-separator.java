import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
      List<String> res=new ArrayList<>();
      String regexSep = Pattern.quote(String.valueOf(separator));
      for(String h:words)
      {
        for(String x:h.split(regexSep))
        {
            if(!x.isEmpty())
            {
                res.add(x);
            }
        }
      }
     return res;
        
    }
}