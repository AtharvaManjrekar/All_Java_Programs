import java.util.*;
import java.io.FileReader;
import java.io.File;
public class FileReaderDemo {
    public static void main(String[] args) {
      File file = new File("A:\\Java");
      try{
          FileReader fr = new FileReader("Atharva.txt");
          int i = 0;
          while((i=fr.read())!= -1) {
              System.out.println((char)i);
          }
          fr.close();
      }
      catch(Exception e){
          System.out.println(e);
        }
    }
}
