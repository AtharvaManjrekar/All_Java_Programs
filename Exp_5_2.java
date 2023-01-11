import java.util.*;
public class Exp_5_2 {
    public static Map<Integer,List<String>>grouping_length(List<String>arr) {
        Map<Integer, List<String>> ath = new HashMap<Integer, List<String>>();
        for (String str : arr) {
            int length = str.length();
            if (ath.containsKey(length)) {
                List<String> rs = ath.get(length);
                rs.add(str);
                ath.put(length, rs);
            }
            else {
                List<String> rs = new ArrayList<String>();
                rs.add(str);
                ath.put(length, rs);
            }
        }
        return ath;
    }
    public static void main(String args[]){
        List<String> l = new ArrayList<String>();
        l.add("Atharva");
        l.add("Anushka");
        l.add("Sai");
        l.add("Harsh");
        l.add("Nimisha");
        System.out.println(grouping_length(l));
    }
}
