package Practical_3;

class Person{
    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void setStreet(String street) {
        this.street = street;
    }

    String street;
    public void setCity(String city) {
        this.city = city;
    }

    String city;
    public void setId(int id) {
        this.id = id;
    }
    public void setDd(int dd) {
        this.dd = dd;
    }
    public void setMm(int mm) {
        this.mm = mm;
    }
    int id;
    int dd;
    int mm;
    public void setYy(int yy) {
        this.yy = yy;
    }

    int yy;
    public void setAge(int age) {
        this.age = age;
    }

    int age;
    public void setPin(int pin) {
        this.pin = pin;
    }

    int pin;

    //Default constructor
    Person(){
        this.name = "ABC";
        this.id = 42;
        this.dd = 28;
        this.mm = 9;
        this.yy = 2005;
        this.age = 17;
        this.pin = 400030;
        this.street = "Worli koliwada";
        this.city = "Mumbai";
    }

    //Parameterized constructor
    Person(String name,String city,String street,int dd,int mm,int yy,int pin,int age,int id){
        this.name = name;
        this.city = city;
        this.street = street;
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
        this.pin = pin;
        this.age = age;
        this.id = id;
    }

    //Display Method --->
    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("City is : "+city);
        System.out.println("Street is : "+street);
        System.out.println("DOB is : "+dd+" "+ mm +" "+ yy);
        System.out.println("Pin is : "+ pin);
        System.out.println("Age is : "+age);
        System.out.println("Id is : "+id);
    }

}
public class Practical3_1_1 {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person("Ananya", "Mumbai", "Worli", 11, 2, 2012, 400030, 12, 132);
        Person p3 = new Person();
        // calling getters and setters ---->
        p3.setName("Atharva");
        p3.setCity("Mumbai");
        p3.setStreet("Worli");
        p3.setDd(28);
        p3.setMm(9);
        p3.setYy(2005);
        p3.setPin(400030);
        p3.setAge(17);

        // calling methods
        System.out.println("Default constructor --->");
        p.display();
        System.out.println();

        System.out.println("Parameterized constructor --->");
        p2.display();

        System.out.println();
        System.out.println("Setters ----> ");
        p3.display();
    }
}
