import java.util.*;
import java.util.stream.Collectors;

public class Pr_5_3 {
    public static void main(String args[]){
        List<List<String>> ath = List.of(
                List.of("Atharva","Anushka","Nimisha","Harsh","Sarthak"),
                List.of("GPM","VJTI","Vidyalankar","Atharva"),
                List.of("Mumbai","Worli","USA"));
        System.out.println(ath);
        List<String> n = ath.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(n);

    }
}
