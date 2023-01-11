package Practical_3;

class Vehicle{
    int regNo;
    int reBookNumber;
    String manufacturer;
    int numberOfWheels;
    String vehicleType;
    String Model;
    int numberOfSeats;

    Vehicle(){
        this.regNo = 32;
        this.reBookNumber = 1000001;
        this.manufacturer = "Ford";
        this.numberOfWheels = 4;
        this.vehicleType = "SUV";
        this.Model = "Ford Ranchero 3012";
        this.numberOfSeats = 8;
    }
    Vehicle(int regNo,int reBookNumber,String manufacturer,int numberOfWheels,String vehicleType,String Model,int numberOfSeats){
        this.regNo = regNo;
        this.reBookNumber = reBookNumber;
        this.manufacturer = manufacturer;
        this.numberOfWheels = numberOfWheels;
        this.vehicleType = vehicleType;
        this.Model = Model;
        this.numberOfSeats = numberOfSeats;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public void setReBookNumber(int reBookNumber) {
        this.reBookNumber = reBookNumber;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setModel(String model) {
        Model = model;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void print(){
        System.out.println("Reg no : "+regNo);
        System.out.println("ReBookNo no : "+reBookNumber);
        System.out.println("Manufacturer : "+manufacturer);
        System.out.println("Number of Wheels : "+numberOfWheels);
        System.out.println("Vehicle type : "+vehicleType);
        System.out.println("Model : "+Model);
        System.out.println("No of seats: "+numberOfSeats);
    }
}
public class Practical_3_1_4 {
    public static void main(String[] args) {
        Vehicle vhc = new Vehicle();
        Vehicle vhc2 = new Vehicle(1020,1022,"Ford",4,"Suv","Ford Ranchero 1977",4);
        Vehicle vh3 = new Vehicle();
        vh3.setRegNo(1020);
        vh3.setReBookNumber(1020);
        vh3.setManufacturer("Ford");
        vh3.setNumberOfWheels(4);
        vh3.setVehicleType("SUV");
        vh3.setModel("Ford Ranchero 1970");
        vh3.setNumberOfSeats(6);
        vhc.print();
        System.out.println();
        vhc2.print();
        System.out.println();
        vh3.print();
    }
}
