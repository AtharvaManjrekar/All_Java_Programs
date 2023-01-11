import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
      TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
      tm.put(10,"Mango");
      tm.put(20,"Apple");
      tm.put(03,"Banana");
      tm.put(64,"Orange");
        System.out.println(tm);
        tm.replace(1,"Mango","Atharva");
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        tm.clear();
        System.out.println(tm);
    }
}
