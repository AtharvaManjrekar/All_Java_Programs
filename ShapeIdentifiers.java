import java.util.Scanner;
public class ShapeIdentifiers{
    public static void main(String[] args) {
        int no_side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sides:");
        no_side= sc.nextInt();
        if (no_side==3){
         System.out.println("This shape is Triangle.");
     }
     if (no_side==4){
         int side1,side2,side3,side4;
         System.out.println("Enter the value of side:");
         side1 = sc.nextInt();
         side2 = sc.nextInt();
         side3 = sc.nextInt();
         side4 = sc.nextInt();
         System.out.println("Side 1 = "+side1);
         System.out.println("Side 2 = "+side2);
         System.out.println("Side 3 = "+side3);
         System.out.println("Side 4 = "+side4);
         if (side1==side2 && side1==side3 && side1==side4 && side2==side3 && side2== side4 && side3==side2 && side3==side4){
             System.out.println("This shape is Square.");
         } else if (side1==side3 && side2==side4){
             System.out.println("This shape is Rectangle.");
         } if (side1!=side2 && side1!=side3 && side1!=side4 && side2!=side3 && side2!=side4 && side3!=side2 && side3!=side4){
             System.out.println("This shape is quadrilateral");
         }
     } else if (no_side==5){
         System.out.println("This shape is Pentagon");
     } else if (no_side==6){
         System.out.println("This shape is Hexagon");
     } else if (no_side==7){
         System.out.println("This shape is Heptagon");
     } else if (no_side==8){
         System.out.println("This shape is Octagon");
     } else if (no_side==9){
         System.out.println("This shape is Nonagon");
     } else if (no_side==10){
         System.out.println("This shape is Decagon");
     }

    }
}
