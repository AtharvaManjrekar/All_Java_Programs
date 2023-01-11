
public class Practical_Two_Eight {
    public static float heron(int x){
        float n = (float)x;
        float a = 1f;
        while(n-a>0.00001){
            n = (n+a)/2;
            a = x/n;
        }
        return n;
    }
     public static void main(String[] args) {
        int a = 100;
        float b = heron(a);
        System.out.println(b);
        
    }
   }
    

