import java.util.*;
class Object1 implements Comparator<Integer> {
    int o1;
    int o2;
    public int compare(Integer o1 , Integer o2) {
        if (o1 > o2) {
            return 1;
        } else if (o1 < o2) {
            return -1;
        }
        return 0;
    }
    public class ComparatorInterfaceDemo{
        public static void main(String [] args){
            ComparatorInterfaceDemo1 ci = new ComparatorInterfaceDemo1();
            System.out.println(ci.compare(100,200));//-1
            System.out.println(ci.compare(200,100));//1
            System.out.println(ci.compare(100,100));//0

        }
    }
}
