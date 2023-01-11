import java.io.*;
import java.util.Scanner;
import java.math.*;

public class PrimeNumberDetector{
    public static void main(String[] args) {
        int no;
        System.out.println("Enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        if (no/no == 1 && no%1 ==0){
            System.out.println("The entered number is a prime number");
        }
        else{
            System.out.println("The entered number is not a prime number");
        }
    }
}
