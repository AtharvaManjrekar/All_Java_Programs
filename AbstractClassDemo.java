 class Person1{
    String name;
    int age;
    public String setName(String n){
        this.name = n;
        return name;
    }
    public int setAge(int a){
        this.age = 100;
        return age;
    }
}
public class AbstractClassDemo {
    public static void main(String [] args){
        Person1 p1 = new Person1();
        p1.setName("Atharva Deepak Manjrekar");
        p1.setAge(17);
       final int b = 1000;
        //int b+c = 20;
        System.out.println("The value of b is :"+b);
        System.out.println("My name is : "+p1.name+ "\nMy age is : "+p1.age);

    }
}
