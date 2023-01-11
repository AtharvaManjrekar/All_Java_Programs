// IT HAS ONLY ONE METHOD i.e compareTo()
import java.lang.*;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int age;
    int marks;
    Student(String name , int age , int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public int compareTo(Student st) {
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else if (age < st.age) {
            return -1;
        }
        return 0;
    }
}
public class ComparableInterfaceDemo{
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Atharva",17,90));
        al.add(new Student("Ayush",15,80));
        al.add(new Student("Anushka",17,85));
        Collections.sort(al);
        for (Student st:al){
            System.out.println(st.name+" "+st.age+" "+st.marks+" ");
        }
    }
}
