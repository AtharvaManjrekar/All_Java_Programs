class Vehicle{
    String name;
    double cost;
    String color;
    int no_of_wheel;
    int model_no;

    public Vehicle(String name, double cost, String color) {
    }

    void vehicle(){
        System.out.println("Vehicle details: ");
    }
    Vehicle(String name , double cost , String color , int no_of_wheel , int model_no){
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.no_of_wheel = no_of_wheel;
        this.model_no = model_no;
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Cost: "+cost);
        System.out.println("Color: "+color);
        System.out.println("No of vehicles :"+no_of_wheel);
        System.out.println("Model no :"+model_no);
    }
}
class Car extends Vehicle{
    private int no_of_seater;
    Car(String name , double cost , String color , int no_of_wheel , int model_no , int no_of_seater){
        super(name,cost,color,no_of_wheel,model_no);
        this.no_of_seater = no_of_seater;
    }
    public void carDetails(){
        System.out.println("Printing Car details:");
        printDetails();
        System.out.println("No of seats:"+no_of_seater);
    }
}
class Train extends Vehicle{
    int no_of_coaches;
    int no_of_stations;
    String train_route;
    Train(String name,double cost,String color,int no_of_coaches,int no_of_stations,String train_route) {
        super(name, cost, color);
        this.no_of_coaches = no_of_coaches;
        this.no_of_stations = no_of_stations;
        this.train_route = train_route;
    }
       void PrintTrainDetails(){
           printDetails();
            System.out.println("No of coaches:"+no_of_coaches);
            System.out.println("No of station:"+no_of_stations);
            System.out.println("Route of train:"+train_route);
        }
    }
class Truck extends Vehicle{
    int capacity;
    String type;
    Truck(String name,double cost,String color,int no_of_wheel,int model_no,int capacity,String type){
        super(name,cost,color,no_of_wheel,model_no);
        this.capacity = capacity;
        this.type = type;
    }
    void PrintTruckDetails(){
        printDetails();
        System.out.println("Capacity in tons:"+capacity);
        System.out.println("Type of truck:"+type);
    }
}
public class Exp_3_1 {
    public static void main(String[] args) {
        Car v1 = new Car("Honda",500000,"Red",4,123,8);
        v1.carDetails();
        Truck t1 = new Truck("Maruti",80000,"Black",6,120,7,"Casual");
        t1.PrintTruckDetails();
        Train t2 = new Train("Raajdhaani Express",30000000,"Blue",12,25,"Delhi-Rajastan");
        t2.PrintTrainDetails();
        System.out.println("The program executed sucessfully....");
    }
}
