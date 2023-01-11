import java.io.FileWriter;
public class Exp_6_6 {
    public static void main(String[] args) {
        try{
            FileWriter fout = new FileWriter("FileHandling2.txt");
                 fout.write("Hello,My name is Atharva Manjrekar!\n");
                 fout.write("My enrollment number is FS21CO024");
            System.out.println("Success");
                 fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
