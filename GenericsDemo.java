// Example of generics class...
/*
class Base2<T,S>{
    T obj1;
    S obj2;
}
public class GenericsDemo {
    public static void main(String[] args) {
       Base2<Integer,String> o = new Base2<>();
       o.obj1 = 12;
       o.obj2 = "Hello World";
        System.out.println(o.obj1);
        System.out.println(o.obj2);
    }
}
 */
// Example of generics method..
class Test {
    public <T> void showItemDetails(T item){
        System.out.println("Value of the item: " + item);
        System.out.println("Type of the item: "
                + item.getClass().getName());
    }
}

public class GenericsDemo {
    public static void main(String args[]){
        //String type test
        Test test = new Test();
       test.showItemDetails('H');
       test.showItemDetails("Atharva");
       test.showItemDetails(100);
       test.showItemDetails(35.45f);
       test.showItemDetails(5500.6358753);
    }
}
