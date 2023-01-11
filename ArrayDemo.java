// One Dimensional Array
/*
public class ArrayDemo {
    public static void main(String[] args) {
        int marks[] = new int[10];
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;
        marks[5] = 600;
        marks[6] = 700;
        marks[7] = 800;
        marks[8] = 900;
        marks[9] = 1000;
       for (int i = 0 ; i<marks.length ; i++){
           System.out.println(marks[i]);
       }
    }
}
 */
// Multidimensional array
import java.util.Scanner;
public class ArrayDemo{
    public static void main(String [] args){
        int number[][] = new int [2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");

        try {
            for (int i = 0; i<2;i++) {
                for (int j = 0; j<2; j++) {
                  number[i][j]=sc.nextInt();
                }
            }
            System.out.println("The two dimensional array: \n");
            for (int i = 0; i<2;i++) {
                for (int j = 0; j<2; j++) {
                    System.out.println(number[i][j]+" ");
                }
                System.out.println("\n");
            }
        }
        catch (Exception ArrayIndexOutOfBoundException){
            System.out.println("Unable to print array");
        }
    }
}
