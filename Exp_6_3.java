import java.io.FileInputStream;
public class Exp_6_3 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("FileHandling2.txt");
           int i = 0;
           while((i=fin.read())!=-1){
               System.out.println((char)i);
           }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
