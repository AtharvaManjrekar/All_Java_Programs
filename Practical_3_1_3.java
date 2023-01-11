package Practical_3;

class Point{
    int x;
    int y;
    int z;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }

    Point(){
        this.x = 31;
        this.y = 32;
        this.z = 33;
    }
    Point(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void print_xyz(){
        System.out.println("Three values are ---> " + x + " " + y + " " + z);
    }
}
public class Practical_3_1_3 {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point(31,32,33);
        Point p3 = new Point();
        p3.setX(31);
        p3.setY(32);
        p3.setZ(33);
        p.print_xyz();
        p2.print_xyz();
        p3.print_xyz();
    }
}
