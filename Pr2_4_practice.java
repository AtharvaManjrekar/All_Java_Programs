// 2.4 Write a program to print addition of two integers input from command line arguments.
public class Pr2_4_practice {
    public static void main(String args[]){
      int num[] = new int[2];
      for (int i = 0;i<args.length;i++){
          num[i]=Integer.parseInt(args[i]);
          System.out.println(num[i]);
      }
      int sum = num[0]+num[1];
      System.out.println("The sum of entered number is :"+sum);
    }
}
