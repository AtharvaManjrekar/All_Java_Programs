import java.io.File;
import java.io.FileInputStream;
public class FileInputStreamDemo{
    public static void main(String[] args) {
        File file = new File("A:\\Java");
        try {
            FileInputStream fin = new FileInputStream("Atharva.txt");
            int i = 0;
            while((i = fin.read())!= -1){
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}