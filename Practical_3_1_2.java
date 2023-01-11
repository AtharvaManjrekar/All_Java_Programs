package Practical_3;

import java.util.zip.DeflaterOutputStream;

class Department{
    String name;int headId;String dateOfEstablishment;String headOfficeLocation;int noOfEmployees;
    // Setters --->
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfEstablishment(String dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }
    public void setHeadOfficeLocation(String headOfficeLocation) {
        this.headOfficeLocation = headOfficeLocation;
    }
    public void setHeadId(int headId) {
        this.headId = headId;
    }
    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    // Default constructors ---->
    Department(){
        this.name = "Computer";
        this.headId = 302;
        this.dateOfEstablishment = "30-4-1997";
        this.headOfficeLocation = "Bandra";
        this.noOfEmployees = 100;
    }

    // Parameterized constructor
    Department(String name,int hid,String doe,String hol,int noe){
        this.name = name;
        this.headId = hid;
        this.dateOfEstablishment = doe;
        this.headOfficeLocation = hol;
        this.noOfEmployees = noe;
    }

    public void print(){
        System.out.println("Name of department is : " + name);
        System.out.println("Head_id of department is : " + headId);
        System.out.println("Date of establishment of department is : " + dateOfEstablishment);
        System.out.println("Head Office location of department is : " + headOfficeLocation);
        System.out.println("No of employees in department is : " + noOfEmployees);
    }
}

public class Practical_3_1_2 {
    public static void main(String[] args) {
    Department dp = new Department();
    Department dp2 = new Department("Computer",10001,"30-4-1997","Bandra",100);
    Department dp3 = new Department();
    dp3.setName("Computer");
    dp3.setHeadId(102);
    dp3.setDateOfEstablishment("30-4-1997");
    dp3.setHeadOfficeLocation("Bandra");
    dp3.setNoOfEmployees(100);
    dp3.print();
    System.out.println();
    dp2.print();
    System.out.println();
    dp3.print();
    }
}
