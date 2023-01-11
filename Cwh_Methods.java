
//Method basic program
 /*
 public class Cwh_Methods {
    static int logic(int x , int y){
        int z = 0;
        if (x > y) {
          z = (x+y)*5;
        }
        else if (x < y){
            z = x + y;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println("This is methods programs.");
        int a = 5;
        int b = 7;
       int c ;
        c = logic(a,b);
        System.out.println("The value of c is : "+c);    }
}
  */
// Method with return type void
/*
public class Cwh_Methods {
    static void TellJoke(){
        System.out.println("I am a funny person");
    }
    public static void main(String[] args) {
         TellJoke();
    }
}
 */
//Method overloading
// Theory: Two or more methods in java can have same name but with different parameters, so this concept is called as method overloading.
// Simple program for showing method overloading
/*
public class Cwh_Methods {
    static void Hello(){
        System.out.println("Hello Brother!");
    }
    static void Hello(int a){
        System.out.println("Hello " +a+ " Brothers!");
    }
    static void Hello(int a , int b){
        System.out.println("Hello " +a*b+ " Brothers!");
    }
    public static void main(String[] args) {
        int a = 1000;
   Hello();
   Hello(a);
   Hello(2,30);
    }
}

 */
// varargs
/*
public class Cwh_Methods{
    static int sum(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The result after addition is :"+sum(300,200,500,1500));
    }
}
 */
// Recursion
/*
import java.util.Scanner;
public class Cwh_Methods {
    static int Factorial(int n){
        if (n == 0 || n ==1){
            return 1;
        }
        else{
            return n* Factorial(n-1);
        }
    }
    public static void main(String[] args) {
    int n = 4;
     System.out.println("The factorial of n is :"+ Factorial(n));
    }
}
 */
// QS 1 : Write a java program to print multiplication of a table using method
/*
public class Cwh_Methods {
    static int multiply(int x){
        for (int i = 1 ; i<=10 ; i++){
            System.out.println(+x+"X"+i+"="+x*i);
        }
    return x ;
    }
    public static void main(String[] args) {
        //int x = 4;
        multiply(4);

    }
}
 */
// QS 2 : Write a program to print the pattern using function
/*
public class Cwh_Methods {
    static void pattern(int n){
        for (int i = 0 ; i<n ; i++){
            for (int j =0 ; j<i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int x = 3;
       pattern(x);
      }
}
 */
// QS 3 : Write a recursive program to find the sum of first n natural number
import java.util.Scanner;
public class Cwh_Methods {
    static int sum(int n){
     int no ;
     Scanner abc = new Scanner(System.in);
     no = abc.nextInt();
     return n;
    }
    public static void main(String[] args) {

    }
}



