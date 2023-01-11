public class Exp_2_8 {
   public static double sqrt(double x)
    {
        double b = x, h = 0;
        while (b != h)
        {
            b = (h+b)/2;
            h = x/b;
        }
        return b;
    }
    public static void main(String args[]){
       double d = sqrt(144);
       System.out.println("The square root of 100 is: "+ d);
    }
}
