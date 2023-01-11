class Person{
    String name;
    int yearOfBirth;
    public void displayDetails(String name,int yearOfBirth){
        this.name = name;
        this.yearOfBirth=yearOfBirth;
        System.out.println("The name of person is:"+name);
        System.out.println("The birth year of "+name+" is:"+yearOfBirth);
    }
}
public class Exp_1_4{
    public static void main(String args[]){
        Person p = new Person();
        p.displayDetails("Atharva",2005);
        p.displayDetails("Dnyandeep",2004);
        p.displayDetails("Yogesh",1974);
    }
}