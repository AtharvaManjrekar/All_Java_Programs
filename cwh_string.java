/*
import java.util.Locale;
import java.util.Scanner;
public class cwh_string {
    public static void main(String[] args) {

          String sc="I am Atharva Manjrekar";
        System.out.println("The string stored is:");
        System.out.println(sc);
        Scanner abc = new Scanner(System.in);
        String sc = abc.nextLine();
        System.out.println(sc);
          //TWO TYPES OF STRING DECLARATION
        //TYPE 1
                String xyz="harry";
                System.out.println(xyz);
       // TYPE 2
                String pqr=new String("ATHARVA");
                System.out.println(pqr);
        int value = pqr.length();
                //System.out.println(value);
                String lstring=pqr.toLowerCase();
                System.out.println(lstring);
                String excuse_me= new String("deepak");
                System.out.println(excuse_me);
                String bcd=excuse_me.toUpperCase();
                System.out.println(bcd);
         String name="Atharva Manjrekar";


        String carrom="aeroplane is in the sky";
        System.out.println(nonStremmedString);
        System.out.println(nonStremmedString.trim());
        System.out.println(nonStremmedString.substring(17));
        System.out.println(nonStremmedString.substring(0,16));
        System.out.println(nonStremmedString.replace('M','K'));
        System.out.println(nonStremmedString.replace("Atharva Manjrekar","Deepak Manjrekar"));
        System.out.println(nonStremmedString.startsWith("Atharva"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(3));
       System.out.println(name.indexOf("a",1));
        System.out.println(name.lastIndexOf("k"));
        System.out.println(carrom.lastIndexOf("p",5));
        System.out.println(carrom.equals("aeroplane is in the sky"));
        System.out.println(carrom.equalsIgnoreCase("AEROPLANE IS IN THE S"));
        System.out.println(carrom.indexOf("ne",0));
        String hello="I am Atharva Deepak Manjrekar";
        System.out.println("My name is \" Atharva Deepak Manjrekar /" );
    }
}

 QUESTION FOR PRACTICE BY CODE WITH HARRY
 QS :- 01) WRITE A JAVA PROGRAM TO CONVERT A STRING INTO LOWER CLASS
import java.util.Scanner;
 public class cwh_string{
     public static void main(String[] args) {
 String abc="ATHARVA MANJREKAR";
         System.out.println(abc.toLowerCase());}}
 QS:- 02) WRITE A JAVA PROGRAM TO REPLACE SPACE IN THE STRING BY UNDERSCORES
import java.util.Scanner;
public class cwh_string{
    public static void main(String[] args) {
        String hello="My Self Atharva Deepak Manjrekar and I am studing in GPM Second Year in Computer Engineering";
        System.out.println(hello.replace(" ","_"));
    }
     }
 QS:- 03) WRITE A JAVA PROGRAM TO REPLACE <| name |> BY YOUR NAME
import java.util.Scanner;
public class cwh_string{
    public static void main(String[] args) {
        String pqr="Hello dear <|name|>";
        System.out.println(pqr.replace("<|name|>","ATHARVA!"));
    }
}
 QS:- 04) WRITE A JAVA PROGRAM TO DETECT DOUBLE AND TRIPLE SPACES IN A STRING.
import java.util.Scanner;
public class cwh_string{
    public static void main(String[] args) {
        String xyz="This program has  double and   triple space";
        System.out.println(xyz.indexOf("  "));
        System.out.println(xyz.indexOf("   "));
    }
}
 QS:- 05) WRITE A JAVA PROGRAM TO FORMAT FOLLOWING STRING USING ESCAPE SEQUENCE CHARACTER
  GIVEN STRING --->  letter="Dear Harry, this java course is nice.Thanks";
import java.util.Scanner;
public class cwh_string {
    public static void main(String[] args) {
        String letter="Dear Harry,\n\tThis java course is nice.\n\t\t\t\t\tThanks alot!!";
        System.out.println(letter);
    }
}
                                       END OF LESSON "STRING"
*/

