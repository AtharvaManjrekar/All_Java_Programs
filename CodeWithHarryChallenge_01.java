// Percentage calculator , taking 5 subject marks from user and removing percentage.
import java.util.Scanner;
public class CodeWithHarryChallenge_01
{
    public static void main(String[] args)
    {
        int marks1 , marks2 , marks3 , marks4 , marks5 , no_of_subject ;
        Scanner sc = new Scanner(System.in);
        System.out.println("MARKS MUST ENTERED MUST BE OUT OF 100.");
        System.out.println("Enter the number of subjects.");
        no_of_subject = sc.nextInt();
        System.out.println("Enter the marks for subject 1:");// Marks entered must be from 100
        marks1 = sc.nextInt();
        System.out.println("Enter the marks for subject 2:");
        marks2 = sc.nextInt();
        System.out.println("Enter the marks for subject 3:");
        marks3 = sc.nextInt();
        System.out.println("Enter the marks for subject 4:");
        marks4 = sc.nextInt();
        System.out.println("Enter the marks for subject 5:");
        marks5 = sc.nextInt();
        int sum = marks1+marks2+marks3+marks4+marks5;
        int out_of_marks=no_of_subject*100;
        double percentage= sum*100/out_of_marks;
        System.out.println("your percentage is  " +percentage);
        if (percentage>=35)
        {
            System.out.println("Congralutions!! You have cleared your Exams");
        }
        else
        {
            System.out.println("Sorry! You are FAIL!");
        }
    }
}