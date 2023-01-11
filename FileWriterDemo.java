import java.io.File;
import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("A:\\Java");
        try{
            FileWriter fw = new FileWriter("Atharva.txt");
            fw.write("Zindagi aaa rahu mee karle muzse dosti zindagi aa raha hu mee.");
            System.out.println("Success");
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
