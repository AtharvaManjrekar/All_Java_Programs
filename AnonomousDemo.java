interface Rahul{
    public default void display(){
        System.out.println("hello world!");
    }
    public default void display2() {
        System.out.println("I am Rohit's fan!");
    }
}
class Ramesh implements Rahul{
    public void show(){
        System.out.println("Ishq wala love..");
    }

    @Override
    public void display(){
        Rahul.super.display();
    }

    @Override
    public void display2() {
        Rahul.super.display2();
    }
}
public class AnonomousDemo {
    public static void main(String[] args) {

    }
}
