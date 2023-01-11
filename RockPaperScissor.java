import java.util.Scanner;
import java.io.RandomAccessFile;
public class RockPaperScissor {
    public static void main(String[] args) {
        byte rock,paper,scissor,input;
        Scanner abc=new Scanner(System.in);
        System.out.println(" 0) ROCK\n 1) PAPER\n 2) SCISSOR");
        System.out.println("Enter the value:-");
        input=abc.nextByte();
        if (input == 0){
            System.out.println("ROCK");
        } else if (input==1) {
            System.out.println("PAPER");
        } else if (input==2) {
            System.out.println("SCISSOR");
        }
        if (input==1){
            System.out.println();
        }

    }
}
