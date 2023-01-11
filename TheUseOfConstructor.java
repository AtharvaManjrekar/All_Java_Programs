// QS:1 create class employee with following properties and methods
 /*
 1) salary(property)(int)
 2) getsalary() (method returning int)
 3) name(property)(String)
 4) getname() (method returning String)
 5)setname() (method changing name)
 ---> Solution
class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
     Employee harry = new Employee();
     int salary = 340000;
     String name = "Atharva Manjrekar";
     harry.getName();
        System.out.println(name);
     harry.getSalary();
        System.out.println(salary);
        System.out.println("Favourite Player name is:"+harry.setName("Rohit Sharma"));
     }
}
 */
// QS:2 create class cellphone to print ringing, vibrating,etc.
/*
class Cellphone{
    public void ringing(){
        System.out.println("Your cellphone is ringing.");
    }
    public void vibrating(){
        System.out.println("Your cellphone is vibrating.");
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        phone.ringing();
        phone.vibrating();
    }
}
 */
// QS:3 create class square with a method to initialize its side,calculating area and calculating perimeter
/*
class Square{
    int side = 10;
    int area;
    int perimeter;
    public int findingArea(){
       area = side*side;
       return area;
    }
    public int findingPerimeter(){
        perimeter = 4*side;
        return perimeter;
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
        Square dimension = new Square();
        System.out.println("The perimeter of square is :"+dimension.findingPerimeter());
        System.out.println("The area of square is :"+dimension.findingArea());

    }
}
 */
// QS:4 create class rectangle with a method to initialize its side, calculating area and calculating perimeter
/*
class Rectangle{
    int length = 20;
    int breadth = 5;

    public int getPerimeter() {
      int perimeter = 2*(length+breadth);
        return perimeter;
    }
    public int getArea(){
      int area = length*breadth;
        return area;
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
        Rectangle object = new Rectangle();
        System.out.println("the perimeter of rectangle is : "+object.getPerimeter());
        System.out.println("The area of rectangle is : "+object.getArea());
    }
}
 */
// QS:5 create a class TommyVecetti for rockstar game capable of hitting , running , firing etc
/*
class TommyVecetti{
    public void hit(){
        System.out.println("Hit the enemy ahead!");
    }
    public void run(){
        System.out.println("Enemy ahead! Run faster!");
    }
    public void fire(){
        System.out.println("Fire on enemy ahead!");
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
        TommyVecetti game = new TommyVecetti();
        game.hit();
        game.fire();
        game.run();
    }
}
 */
// QS:6 create a class circle with a method to initialize its radius, calculating area and calculating circumference
/*
class Circle{
    int radius = 5;
    public float getCircumference(){
        float circumference = (float) (2*3.14*radius);
        return circumference;
    }
    public float getArea(){
        float area = (float) (3.14 * radius * radius);
        return area;
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
        Circle dimension = new Circle();
        System.out.println("The circumference of circle is : "+dimension.getCircumference());
        System.out.println("The area of circle is : "+dimension.getArea());
    }
}
 */

// Using constructor here...
/*
class Human{
    int id;
    String name;
    // Constructor is initialized below---------------------
    public Human(){
        id = 45;
        name = "Atharva Deepak Manjrekar";
    }
    public String getName(){
        return name;
    }
//    public void setName(String n){
//        this.name = n;
//    }
    public int getId(){
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
   Human Rahul = new Human();
        System.out.println("My name is :"+Rahul.getName());
        System.out.println("My id is :"+Rahul.getId());
    }
}
 */

// Using parameterized constructor
/*
class Human{
    int id;
    String name;

    public Human(){
        id = 20;
        name = "abc";
    }
    public  Human(String MyName, int MyId){
        id = 45;
        name = MyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class Cwh_Chp8_ProblemSet {
    public static void main(String[] args) {
     Human person = new Human("AtharvaManjrekar", 50);
        //System.out.println();person.getId();
        Human perso = new Human();
        System.out.println(person.getName());
        System.out.println(person.getId());
        System.out.println(perso.getName());
        System.out.println(perso.getId());
    }
}
 */

// Exercise 3
import java.util.Scanner;
import java.util.Random;

class Game{
    int number;
    int input;
    int no_of_guesses;

    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    public void setNumber(int number) {
        this.number = number;

    }
    public int Game(int n){
        Random rand = new Random();
        number = rand.nextInt(100);
        return number;
    }
    public int UserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        return input;
    }
    public boolean IsCorrectNumber(int num1){
        if (num1 == number){
            return true;
        } else if (num1<number)
        {
            System.out.println("Your number is lesser than random number.");
        }
        else if (num1>number)
        {
            System.out.println("Your number is greater than random number");
        } else {
            System.out.println("Enter correct number.");
        }
        return false;
    }
    public class TheuseOfConstructor {
        public static void main(String[] args) {
            Game g = new Game();
            g.UserInput();
            boolean b =  g.IsCorrectNumber(g.input);
            System.out.println(b);
        }
    }
}

