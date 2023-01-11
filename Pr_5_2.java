import java.util.*;
public class Pr_5_2 {
    public static Map<Integer,List<String>>grouping_length(List<String>arr){
        Map<Integer,List<String>> ath = new HashMap<Integer,List<String>>();

        for (String str:arr){
            int length = str.length();
            if (ath.containsKey(length)){
                List<String> rs = ath.get(length);
                rs.add(str);
                ath.put(length,rs);
            }
            else{
                List<String> rs = new ArrayList<String>();
                rs.add(str);
                ath.put(length,rs);
            }
        }
        return ath;
    }
    public static void main(String args[]){
        List<String> n = new ArrayList<String>();
        n.add("Atharva");
        n.add("Deepak");
        n.add("Harsh");
        n.add("Yogesh");
        System.out.println(grouping_length(n));
    }
}
