/* Practical no :- 2.4
QS:- Write a program to print addition of two integers input from command line arguments
*/


import java.util.Scanner;
public class Practical_Two_Four
{
    public static void main(String[] args)
    {
        int num1 , num2 ;
        Scanner add = new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        num1=add.nextInt();
        System.out.println("Enter the value of num2");
        num2=add.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum of num1 and num2 is "+sum);
    }
}