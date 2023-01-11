import java.util.*;
import java.util.stream.Collectors;
public class StreamAPI2 {
    public static void main(String[] args) {
       ArrayList<Integer> a = new ArrayList<>();
       a.add(500);
       a.add(200);
       a.add(301);
       a.add(100);
        System.out.println(a);
        List<Integer> maplist = a.stream().map(i-> i*2).toList();
        Set<Integer> filterlist = a.stream().filter(i-> i%2 ==0).collect(Collectors.toSet());
        int value = a.stream().reduce(0,(c,b) -> (c>b ? c:b));
        System.out.println("Map method -> "+maplist);
        System.out.println("Reduce method -> "+filterlist);
        System.out.println("Reduce Method-> Largest number in stream:"+value);
        maplist.forEach(integer -> System.out.println("Using for each method:"+integer));
   }
    }
