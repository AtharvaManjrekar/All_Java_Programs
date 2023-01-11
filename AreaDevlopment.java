import java.util.*;
import java.math.*;
public class AreaDevlopment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int the_password;
        int limit;
        System.out.println("Enter the limit on a password!");
        limit = sc.nextInt();
        System.out.println("Enter the password!");
        the_password = sc.nextInt();
        if(the_password>limit){
            System.out.println("Your password is greater than limit");
        }
    }
}
