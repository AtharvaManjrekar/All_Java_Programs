
import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        int num1 , num2 , choice ;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice = abc.nextInt();
        if (choice==1){
            System.out.println("You have choosen Addition.");
        } else if (choice==2) {
            System.out.println("You have choosen Subtraction");
        } else if (choice==3) {
            System.out.println("You have choosen Multiplication");
        } else if (choice==4) {
            System.out.println("You have choosen Division");
        }else {
            System.out.println("You will get remainder after division");
        }
        System.out.println("Enter the value of num1:");
        num1 = abc.nextInt();
        System.out.println("Enter the value of num2:");
        num2 = abc.nextInt();

        switch (choice)
        {
            case 1 : int sum = num1+num2;
                     System.out.println("The sum of both number is "+sum);
                     break;
            case 2 : int subtract;
                     if(num1>num2)
                     {
                         subtract=num1-num2;
                         System.out.println("The subtraction of num2 from num1 is:"+subtract);

                     }
                     else
                     {
                         subtract=num2-num1;
                         System.out.println("The subtraction of num1 from num2 is "+subtract);
                     }
                     break;
            case 3 : int multiply = num1*num2;
                     System.out.println("The multiplication of num1 and num2 is "+multiply);
                     break;
            case 4 : int divide = num1/num2;
                     System.out.println("The division of num1 and num2 is "+divide);
                     break;
            case 5 : int remainder = num1%num2;
                     System.out.println("The remainder is "+remainder);
                     break;
            default:
                     System.out.println("Error!!");
        }
    }
}
