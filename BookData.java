import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Book
{
    String bookname;
    int bookid;
    int price;
    BufferedReader br=new BufferedReader(new InputStreamReader
            (System.in));
    void getdata()
    {
        try
        {
            System.out.println("Enter Book ID=");
            bookid=Integer.parseInt(br.readLine());
            System.out.println("Enter Book Name=");
            bookname=br.readLine();
            System.out.println("Enter Price=");
            price=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    void display()
    {
        System.out.println("Book ID="+bookid);
        System.out.println("Book Name="+bookname);
        System.out.println("Price="+price);
    }
    }
    public class BookData {
        public static void main(String[] args) {
            System.out.println("Enter the number of book you want to buy:");
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            Book b[]=new Book[7];
            for(int i=0;i<n;i++)
            {
                b[i]=new Book();
            }
            for(int i=0;i<n;i++)
            {
                b[i].getdata();
            }
            for(int i=0;i<n;i++)
            {
                b[i].display();
            }
        }
}
