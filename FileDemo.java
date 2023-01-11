import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File obj = new File("A://Java","Atharva.txt");
        try {
            System.out.println(obj.createNewFile());
            System.out.println("Success");
            System.out.println(obj.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
