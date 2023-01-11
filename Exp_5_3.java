import java.util.*;
import java.util.stream.Collectors;
public class Exp_5_3 {
    public static void main(String[] args) {
        List<List<String>> ath = List.of(
                List.of("Atharva","Nimisha","Anushka","Sarthak"),
                List.of("GPM","VJTI","Atharva","Vidyalankar"),
                List.of("Mumbai","USA","New York"));
        System.out.println(ath);
        List<String> l = ath.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(l);
    }
}
