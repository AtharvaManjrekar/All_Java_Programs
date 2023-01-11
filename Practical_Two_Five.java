/*  Practical no:-2.5
    QS:- Write a program to take two integers from command line, subtract the smaller number from the greater
    and print the result.
 */
import java.util.Scanner;
public class Practical_Two_Five{
    public static void main(String[] args)
    {
        int num1 , num2 ;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the value of num1");
        num1 = abc.nextInt();
        System.out.println("Enter the value of num2");
        num2 = abc.nextInt();
        int subtract;
        if(num1>num2)
          {
              subtract = num1 - num2;
          }
          else
          {
              subtract = num2 - num1;
          }
        System.out.println("The result of subtraction is "+subtract);
    }
}
