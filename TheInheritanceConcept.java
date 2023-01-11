/*
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting the value of x now:");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class TheInheritanceConcept {
    public static void main(String[] args) {
    Base object = new Base();
    object.setX(20);
   // object.getX();
        System.out.println(object.getX());
        Derived y = new Derived();
        y.setY(50);
        //System.out.println(y.getY());
        y.setX(2);
        System.out.println(y.getX());
    }
}
 */
// PRACTICE SET OF CODE WITH HARRY
// QS 1 ) CREATE CLASS CIRCLE AND USE INHERITANCE TO CREATE ANOTHER CLASS CYLINDER FROM IT
/*
class Circle {
    int radius;
    Circle(int r){
        this.radius = r;
    }
   public double area(){
       double area = 2*Math.PI*radius;
       return area;
   }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
       super(r);
       this.height = h;

    }
     public double volume(){
      return Math.PI*radius*radius*height;
     }

}
public class TheInheritanceConcept {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.area());
      Cylinder cr = new Cylinder(5,10);
        System.out.println(cr.volume());
    }
}
 */
// QS 2)  CREATE CLASS RECTANGLE AND USE INHERITANCE TO CREATE ANOTHER CLASS CUBOID FROM IT
/*
class Rectangle{
    int length;
    int breadth;
    Rectangle(int l , int b){
        this.breadth = b;
        this.length = l;
    }
    public int area(){
        int area = length*breadth;
        return area;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int l , int b , int h){
        super(l , b);
        this.height = h;
    }
    public int area(){
       int area2 = 2*(length*breadth+breadth*height+length*height);
        return area2;
    }

}
public class TheInheritanceConcept {
    public static void main(String[] args) {
    Rectangle r = new Rectangle(10,5);
        System.out.println(r.area());
        Cuboid c = new Cuboid(10,5,15);
        System.out.println(c.area());
    }
}
 */
//                                   USE OF ABSTRACT CLASS

abstract class Base{
    Base(){
        System.out.println("This is a constructor of base class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Derived extends Base{
    @Override
    public void greet(){
        System.out.println("Good Afternoon");
    }
}
abstract class Derived2 extends Base{
    public void Hello(){
        System.out.println("Hello sir!");
    }
}
public class TheInheritanceConcept {
    public static void main(String[] args) {
    Derived d = new Derived();
    d.greet();
    Base b = new Base() {
        @Override
        public void greet() {
            System.out.println("Hello Dear");
        }
    };
    b.greet();

    }
}