// package com.gpm;
/**
 * Here we have used class </h3> Gadget </h3> <br>
 * We have used data members such as Manufacturer , color , manufacture_year , model

 */
class Gadget{

    private String Manufacturer;
    private String color;
    private int manufacture_year;
    private String model;

    /**
     * This is a constructors used in our program. We have used  parameterized constructors <br>
     *'this' is the keyword used to refer the object of current class.
     * @param color
     * @param Manufacturer
     * @param manufacture_year
     * @param model
     *
     */
    public Gadget(String Manufacturer, String color, int manufacture_year, String model){
        this.Manufacturer = Manufacturer;
        this.color = color;
        this.manufacture_year = manufacture_year;
        this.model = model;
    }

    /**
     * This is the method named "printdet()" we have used.<br>
     * This method is a void method just used for printing the Name of manufacturer , color of gadget , Manufacturing year and model name

     */
    public void printdet(){
        System.out.println("Manufacturer : "+Manufacturer);
        System.out.println("Color : " +color);
        System.out.println("Manufacture_year : "+manufacture_year);
        System.out.println("Model : "+model);
    }

}
/**
 * Here we have used the concept of </h3>inheritance</h3> <br>
 * Here the class Laptop is a subclass of class Gadget.
 */

class Laptop extends Gadget{
    private String Processor ;
    private int RAM;

    /**
     * Here we have used constructor Laptop.<br>
     * We know that constructor and class has same name
     * The super keyword is a reference variable which is used to refer immediate parent class object. <br>
     * "this" is the keyword used as Reference variable that refers to the current object
     * @param color
     * @param model
     * @param manufacture_year
     * @param Manufacturer
     * @param Processor
     * @param RAM
     */
    public Laptop(String Manufacturer, String color, int manufacture_year, String model,String Processor, int RAM){
        super(Manufacturer, color, manufacture_year,model);
        this.Processor = Processor;
        this.RAM = RAM;
    }

    /**
     *  Here we have used the method to print the details of laptop
     *  The return type of this method is void i.e it will return nothing
     *  The name of this method is "PrintLaptopDet()"
     */
    public void PrintLaptopDet(){
        printdet();
        System.out.println("Processor : "+Processor);
        System.out.println("RAM (in MB) : "+ RAM);

    }

}

/**
 ** This is a Inheritance Program which tells us how one class can extend to the another class.
 * @author  : DNYANDEEP , ATHARVA
 * @version : Version 1.0
 * @since   : 10/10/2022
 */
public class Experiment_3_3 { // Atharva
    /**
     * A main class is a class that is the root of a program’s functionality. A class is defined first,
     and then all other classes that depend on it are defined in the class’ definition.
     * Main class is also known as a starting point of execution of a program.<br>
     * In a main class :- <br>
     * 1)public:<br>
     * It is an Access modifier, which specifies from where
     * and who can access the method. Making
     * the main() method public makes it globally available.<br>
     * 2)static:<br>
     * It is a keyword that is when associated with a method,
     * making it a class-related method. The main() method
     * is static so that JVM can invoke it without instantiating
     * the class.<br>
     * 3)void:<br>
     * It is a keyword and is used to specify that a method
     * doesn’t return anything. As the main() method doesn’t
     * return anything, its return type is void.<br>
     * 4)main:<br>
     * It is the name of the Java main method. It is the
     * identifier that the JVM looks for as the starting point
     * of the java program. It’s not a keyword.<br>
     * 5)String args[]<br>
     * It stores Java command-line arguments and is an array
     * of type java.lang.String class. Here, the name of the
     * String array is args but it is not fixed and the user can
     * use any name in place of it.<br>
     * @param args : It takes java command line argument.
     */
    public static void main(String[] args) {
            Laptop l1 = new Laptop("DELL" ,"FANTASTIC BLACK",2020,"INSPIRION 3510", "Intel i5 11th Gen",8192);

            l1.PrintLaptopDet();

        }
}
