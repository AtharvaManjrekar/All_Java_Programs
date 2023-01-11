
import java.util.Scanner;
public class StrikeRate_Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome in strike rate calculator in Cricket.");
        float ball_faced;
        float run_scored;
        float strike_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of a batsman:");
        run_scored = sc.nextFloat();
        System.out.println("Enter the number of ball faced by batsman:");
        ball_faced = sc.nextFloat();
        strike_rate = (run_scored / ball_faced) * 100;
        System.out.println("The strike rate of batsman is :" + strike_rate);

    }
}
