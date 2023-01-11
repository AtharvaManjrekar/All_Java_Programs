/* THIS CLASS HAS EVERY TYPES OF STATEMENTS AND OPERATORS...

1) CONDITIONAL STATEMENTS:- 1) if-else 2) SWITCH CASE 3) IF-ELSE LADDER;
2) RELATIONAL OPERATORS:- ==(USED FOR COMPARISON), =(USED FOR ASSIGNMENT),>=(GREATER THAN EQUAL TO),
 <=(LESSER THAN EQUAL TO),!=(NOT EQUAL TO);
3) LOGICAL OPERATORS:- &&(AND OPERATORS), ||(OR OPERATORS),!(NOT OPERATORS)
4) LOOPS:- DO-WHILE LOOP, FOR LOOP, WHILE LOOP;

*/

                                          //  WHILE LOOP
/*
  public class cwh_conditional_statements {
    public static void main(String[] args) {
        int i=100;
        while(i<=200){
            System.out.println(i);
            i++;
        }

    }
}
*/
                                          // DO-WHILE LOOP
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int a=1;
        int n;
        System.out.println("Enter the value of n:-");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while (a<=n);
    }
}
 */

                                         // FOR LOOP
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int n=1;
        for (int i=0 ;i<=13;i++){
            System.out.println(2*i+1);
        }
    }
}
 */
                                           // DECREMENTING FOR LOOP
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
    }
}
 */

                                    // IF-ELSE STATEMENTS.
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:-");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("YOU CAN DRIVE A VEHICLE.");
        }
        else{
            System.out.println("YOU CANNOT DRIVE A VECHICLE.");
        }
    }
}
 */
                                    // BREAK STATEMENT
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int i=0;
        for ( i=0;i<5;i++) {
            System.out.println(i);
            if (i == 2) {
                System.out.println("Ending a loop");
                break;
            }
        }

    }
}
 */
                                   // CONTINUE STATEMENT
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i++){
            if (i>2 && i<5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
 */

                                  // SWITCH STATEMENTS
/*
import java.util.Scanner;
class cwh_conditional_statements{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are eligible to drive a vehicle.2025");
                break;
            case 20:
                System.out.println("You can vote!!");
                break;
            case 75:
                System.out.println("You are over aged! It will be dangerous to drive a vehicle");
                break;
            default:
                System.out.println("Please enter your correct age.");
        }
    }
}
 */
                                 // NESTED IF'S
/*
import java.util.Scanner;
class cwh_conditional_statements{
      public static void main(String[] args) {
          int age;
          System.out.println("Enter your age:");
          Scanner sc = new Scanner(System.in);
          age=sc.nextInt();
          if (age<18){
              System.out.println("You cannot vote and drive.");
          }
          if (age==18){
              System.out.println("You can apply for voting card and driving license");
          }
          if (age>=18 && age<=74){
              System.out.println("You can vote and drive the vehicle too.");
          }
          if (age>=75){
              System.out.println("You are too old to drive! You can vote!");
          }
               }
                    }
 */
                                 // FOR EACH LOOP
/*
class cwh_conditional_statements{
   public static void main(String[] args) {
       Syntax:
       for (type var : array)
       { statements using var; }
       is equivalent to:

for (int i=0; i<arr.length; i++)
{
type var = arr[i];
statements using var;
}
            }
          }
 */

                      // QUESTION 1:- WILL NOT RETURN OUTPUT.........
/*
public class cwh_conditional_statements {
                          public static void main(String[] args) {
                              //THIS PROGRAM WILL NOT RETURN ANY VALUE
                          }
}
*/


//QUESTION 2:- WRITE A JAVA PROGRAM TO FIND WHETHER A STUDENT IS PASS OR FAIL, IF IT REQUIRES TOTAL 40% IN EXAM AND 33%IN SUBJECT.

/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of subject1:-");
        m1= sc.nextByte();
        System.out.println("Enter the marks of subject2:-");
        m2=sc.nextByte();
        System.out.println("Enter the marks of subject3:-");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("YOUR AVERAGE IS:- "+avg);
        if (avg>=40 && m1>33 && m2>33 && m3>33){
            System.out.println("CONGRALUTIONS YOU HAVE CLEARED THE EXAMS.");
        }
        else{
            System.out.println("SORRY YOU HAVE NOT CLEARED THE EXAMS.");
        }
    }
}
*/


                                 // QS:- 3 YOU HAVE TO CALCULATE THE PERCENTAGE OF TAX SHOULD BE PAID BY US
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
       float income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you annual income:-");
        income = sc.nextFloat();
        if(income<250000){
            System.out.println("You are not eligible to pay income tax.");
        } else if (income>=250000 && income<=500000) {
            System.out.println("You have to pay 5% income tax on your income.");
        } else if (income>=500000 && income<=1000000) {
            System.out.println("You have to pay 20% income tax on your income. ");
        } else if (income>=1000000) {
            System.out.println("You have to pay 30% income tax on your income.");
        }
        float tax;
        if(income<250000){
            tax=0;
            System.out.println("You will pay the following amount of income tax in INDIAN RUPEES:-"+tax);
        } else if (income>=250000 && income<=500000) {
            tax=5*income/100;
            System.out.println("You will pay the following amount of income tax in INDIAN RUPEES:-"+tax);
        } else if (income>=500000 && income<=1000000) {
            tax=20*income/100;
            System.out.println("You will pay the following amount of income tax in INDIAN RUPEES:-"+tax);
        } else if (income>=1000000) {
            tax=30*income/100;
            System.out.println("You will pay the following amount of income tax in INDIAN RUPEES:-"+tax);
        }
        }
        }
 */


                                 //QUESTION 4:- WRITE A JAVA PROGRAM TO FIND THE DAY OF WEEK ON ITS NUMBER
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        byte number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextByte();
        switch(number){
            case 1: System.out.println("MONDAY");
                    break;
            case 2: System.out.println("TUESDAY");
                    break;
            case 3: System.out.println("WEDNESDAY");
                    break;
            case 4: System.out.println("THURSDAY");
                    break;
            case 5: System.out.println("FRIDAY");
                    break;
            case 6: System.out.println("SATURDAY");
                    break;
            case 7: System.out.println("SUNDAY");
                    break;
            default:
                System.out.println("INVALID INPUT!!");
        }
    }
}
*/


                                //QUESTION 5 :- FIND OUT THE TYPE OF WEBSITES
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        String abc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits after dot(.)");
        abc=sc.next();
        if (abc.endsWith(".com")){

            System.out.println("This website is a commercial website.");
        } else if (abc.endsWith(".org")) {
            System.out.println("This website is an organizational wbesite.");
        } else if (abc.endsWith(".in")) {
            System.out.println("This website is an indian website.");
        }

    }
}
 */


                               //QUESTION 6 :- DRAW THE PATTERN USING LOOPS
/*
public class cwh_conditional_statements {
    public static void main(String[] args) {
        int m=4;
        for (int i=m;i>0;i--){
            System.out.print("*");
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
 */

                              //QUESTION 7:- WRITE A PROGRAM TO SUM OF FIRST N EVEN NUMBERS
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;
        int sum=0;
        System.out.println("Enter the value of n:-");
        n=sc.nextByte();
        for (int i=1;i<=n;i++){
            System.out.println(2*i);
            sum=sum+(2*i);
        }
        System.out.println("The sum of all even number is:-"+sum);

    }
}
 */
                             // QUESTION 8:-  WRITE A TABLE OF GIVEN NUMBER ......
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        System.out.println("Enter the number:-");
        n=sc.nextLong();
        for (int i=1;i<=10;i++){
            long ans=n*i;
            System.out.printf("%d X %d = %d\n",n,i,ans);
        }
    }
}
 */

                            // QUESTION 9:- WRITE A TABLE OF GIVEN NUMBER IN REVERSE MANNER.
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:-");
        n = sc.nextInt();
        for (int i = 10; i > 0; i--) {
            int ans = n * i;
            System.out.printf("%d X %d = %d\n", n, i, ans);
        }
       }
    }

 */
                            // QUESTION 10:- WRITE A PROGRAM TO FIND FACTORIAL OF GIVEN NUMBER
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1,factorial=1, n;
        System.out.println("Enter the number to finds its factorial:");
        n=sc.nextInt();
        while (i<=n){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial is:- "+factorial);
    }
}
 */
                           // QUESTION 11:- WRITE A PROGRAM TO FIND TABLE OF 8
/*
import java.util.Scanner;
public class cwh_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=8;
        for (int i=1;i<=10;i++){
            long ans=n*i;
            System.out.printf("%d X %d = %d\n",n,i,ans);
        }
    }
}
 */