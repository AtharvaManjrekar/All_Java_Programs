import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Mango");
        hm.put(2,"Apple");
        hm.put(3,"Banana");
        hm.put(4,"Orange");
        System.out.println("Iterating map:");
        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.remove(3);
        System.out.println(hm);
    }
}
