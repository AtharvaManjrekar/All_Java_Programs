import java.util.*;
public class AgeComparator {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1==o2){
                    return 0;
                }
                if (o2>o1){
                    return -1;
                }
                if (o2<o1){
                    return 1;
                }
                return 100;
            }
        };
        //c.compare(100,200);
        System.out.println(c.compare(100,200));

    }
}
