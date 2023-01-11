import java.io.FileOutputStream;
public class Exp_6_1 {
public static void main(String args[]){
    try{
//        FileOutputStream fout;
//        fout = new FileOutputStream("FileHandling2.txt");
//        fout.write(001);
//        fout.write(101);
//        fout.write('c');
//        System.out.println("Success");
//
        FileOutputStream fout = new FileOutputStream("FileHandling2.txt");
        String s = "Hello Students.";
        byte b[]= s.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Success");
    }
    catch (Exception e){
        System.out.println(e);
    }

}
}