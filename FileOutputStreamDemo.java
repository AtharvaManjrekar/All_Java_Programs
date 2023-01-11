import java.util.*;
import java.util.Scanner;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Atharva.txt");
            int ac  = 101;
           fout.write(ac);
            System.out.println("Success");
            fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
