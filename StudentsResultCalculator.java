import java.util.Scanner;
import java.math.*;
public class StudentsResultCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_subject;
        float sum=0;
        float total_marks;

        System.out.println("Enter the number of subjects:");
        no_of_subject = sc.nextInt();
        int []arr = new int[no_of_subject];
        System.out.println("Enter the marks of "+no_of_subject+" subjects:");
        for (int i = 0 ; i< no_of_subject ; i++){
            System.out.println("Enter the marks:");
            arr[i]=sc.nextInt();
            sum = sum + arr[i];
            if (arr[i]<35){
                System.out.println("You haven't clear this subject");
        } else if (arr[i]>100){
                System.out.println("Please enter your correct marks!");
            }

        }
        total_marks = no_of_subject*100;
        float percentage = sum * 100 / total_marks;
        System.out.println("Marks Obtained:"+sum);
        System.out.println("======================================================================================================");
        System.out.println("Out of :"+total_marks);
        System.out.println("======================================================================================================");
        System.out.println("The obtained percentage is:"+percentage);
        System.out.println("======================================================================================================");

        if (percentage>=90 && percentage<=100){
            System.out.println("Your marks are excellent!");
            System.out.println("======================================================================================================");

            System.out.println("Keep it up!!");
        } else if (percentage>=75 && percentage<=90) {
            System.out.println("You can be better and score more marks!");
            System.out.println("======================================================================================================");

            System.out.println("Need little bit of more improvement.");
        }
        else if (sum<175 || percentage<=34){
            System.out.println("Sorry You could'nt clear the exam");
            System.out.println("======================================================================================================");
        }

    }
}
