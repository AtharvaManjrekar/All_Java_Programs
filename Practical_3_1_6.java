package Practical_3;
import java.util.*;
interface interCost{
    public int cost(int cost);
    public float returnGst(int cost);
}

class taxable implements interCost{
    Scanner sc = new Scanner(System.in);
    @Override
    public int cost(int cost) {
        return cost;
    }

    @Override
    public float returnGst(int returnedCost) {
        float gst = returnedCost + (returnedCost * 0.18f);
        return gst;
    }
}
public class Practical_3_1_6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost to find your gst ---> ");
        int cost = sc.nextInt();
        taxable tbx = new taxable();
        int gst = tbx.cost(cost);
        System.out.println("Your tax to pay after applying gst ---> " + tbx.returnGst(gst));
    }
}