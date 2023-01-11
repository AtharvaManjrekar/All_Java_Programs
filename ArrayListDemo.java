import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> l1 = new  ArrayList(50);
        //LinkedList<Integer> l2 = new LinkedList();
        l1.add(0,"Mango");
        l1.add(1,"Apple");
        l1.add("Banana");
        l1.remove("Apple");
        //l1.hashCode();
        System.out.println(l1.hashCode());
        //l2.add(0,50000);
        //l2.add(1,502000);
        //System.out.println(l2);
        synchronized (l1) {
            l1.addAll(2, Collections.singleton("Rakesh"));
        }
        System.out.println(l1);
    }
}
