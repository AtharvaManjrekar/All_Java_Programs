import java.util.*;
import java.util.stream.Collectors;
public class StreamApi{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(53);
        arrayList.add(60);
        List<Integer> m = arrayList.stream().map(i -> i * 2).toList();
        Set<Integer> f = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
        int val = arrayList.stream().reduce(0,(a,b) -> (a > b?a:b));
        System.out.println("Map method -> " + m);
        System.out.println("Filter method -> " + f);
        System.out.println("Reduce method -> Largest number is ArrayList -> " + val);
       // int i;
        m.forEach(i-> System.out.println("Using for Each method->"+i));
        }

}