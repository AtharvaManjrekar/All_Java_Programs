/*  Practical no:- 2.7
    QS:- Consider any two integers. Write a program to print sum of their squares.
*/
import java.util.Scanner;
public class Practical_Two_Seven
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int num1 , num2;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1=abc.nextInt();
        System.out.println("Enter the value of num2");
        num2=abc.nextInt();
        int SumOfSquare= num1*num1+num2*num2;
        System.out.println("The sum of square of both number entered is "+SumOfSquare);
    }
}
