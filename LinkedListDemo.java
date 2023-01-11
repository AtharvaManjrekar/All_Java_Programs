import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,50000);
        linkedList.add(1,1000);
        linkedList.addAll(2, Collections.singleton(3000));
        linkedList.addFirst(2000); // method not available in al
        linkedList.addLast(3);     // method not available in al
        linkedList.removeFirst();     // method not available in al
        linkedList.removeLast();      // method not available in al
        //System.out.println(linkedList.hashCode());
        System.out.println(linkedList.spliterator());


    }
}
