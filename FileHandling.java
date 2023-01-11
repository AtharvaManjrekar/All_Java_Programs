import java.util.*;
import java.util.Scanner;
import java.io.*;
public class FileHandling{
    public static void main(String [] args){
        // Creating a new file
        /*
        File myfile = new File("Atharva.txt");
        try {
            myfile.createNewFile();
            System.out.println("New file created!");
        } catch (IOException e) {
            System.out.println("Unable to create new file");
            throw new RuntimeException(e);
        }
         */
        // Writing in new file
       /*
        try {
                FileWriter fw = new FileWriter("Atharva.txt");
                fw.write("I am writing this in my new file hoping it to be stored in my new file");
                fw.close();
            } catch (IOException e) {
            System.out.println("I am unable to write in a file");
                throw new RuntimeException(e);
            }
        */

         /*
        try{
            FileOutputStream f = new FileOutputStream("Atharva.txt");
            f.write(998);
        } catch(IOException e){
            System.out.println("I am unable to write this file");
            throw new RuntimeException(e);
        }

          */

        try{
            FileReader fi = new FileReader("Atharva.txt");
            fi.read();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }


    }
}