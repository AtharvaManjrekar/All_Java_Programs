package Practical_3;

class Laptop{

    
    double imei;
    String processor;
    float processor_speed;
    String primary_mem_type;
    int primary_mem_cap;
    String secondary_storage_type;
    int secondary_storage_capacity;
    String screen_resolution;
    String screen_type;
    String isLED;
    String listOfPorts;
    String os;

    public void setImei(double imei) {
        this.imei = imei;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setProcessor_speed(float processor_speed) {
        this.processor_speed = processor_speed;
    }

    public void setPrimary_mem_type(String primary_mem_type) {
        this.primary_mem_type = primary_mem_type;
    }

    public void setPrimary_mem_cap(int primary_mem_cap) {
        this.primary_mem_cap = primary_mem_cap;
    }

    public void setSecondary_storage_type(String secondary_storage_type) {

        this.secondary_storage_type = secondary_storage_type;
    }

    public void setSecondary_storage_capacity(int secondary_storage_capacity) {
        this.secondary_storage_capacity = secondary_storage_capacity;
    }

    public void setScreen_resolution(String screen_resolution) {
        this.screen_resolution = screen_resolution;
    }

    public void setScreen_type(String screen_type) {
        this.screen_type = screen_type;
    }

    public void setIsLED(String isLED) {
        this.isLED = isLED;
    }

    public void setListOfPorts(String listOfPorts) {
        this.listOfPorts = listOfPorts;
    }

    public void setOs(String os) {
        this.os = os;
    }


    // Laptop ---->>>>>>
    public Laptop() {
        this.imei = 121410151617879d;
        this.processor = "AMD - RYZEN 7 5600G GAMING PROCESSOR";
        this.processor_speed = 3.80f;
        this.primary_mem_type = "RAM";
        this.primary_mem_cap = 16;
        this.secondary_storage_type = "ROM";
        this.secondary_storage_capacity = 1;
        this.screen_resolution = "1920 x 2160";
        this.screen_type = "O-LED";
        this.isLED = "YES";
        this.listOfPorts = "HDMI, USB - 2, CHARGING PORT";
        this.os = "Windows - 10";
    }

    public Laptop(double imei, String processor, float processor_speed, String primary_mem_type, int primary_mem_cap, String secondary_storage_type, int secondary_storage_capacity, String screen_resolution, String screen_type, String isLED, String listOfPorts, String os) {
        this.imei = imei;
        this.processor = processor;
        this.processor_speed = processor_speed;
        this.primary_mem_type = primary_mem_type;
        this.primary_mem_cap = primary_mem_cap;
        this.secondary_storage_type = secondary_storage_type;
        this.secondary_storage_capacity = secondary_storage_capacity;
        this.screen_resolution = screen_resolution;
        this.screen_type = screen_type;
        this.isLED = isLED;
        this.listOfPorts = listOfPorts;
        this.os = os;
    }

    public void print(){
        System.out.println("IMEI number --> " + imei);
        System.out.println("Processor ---> " + processor);
        System.out.println("Processor speed ---> " + processor_speed);
        System.out.println("Primary Memory type ----> " + primary_mem_type);
        System.out.println("Primary Memory Capacity ----> " + primary_mem_cap);
        System.out.println("Secondary memory type ----> " + secondary_storage_type);
        System.out.println("Secondary storage capacity ----> " + secondary_storage_capacity);
        System.out.println("Secondary screen resolution ----> " + screen_resolution);
        System.out.println("Screen type ----> " + screen_type);
        System.out.println("isLed ---> " + isLED);
        System.out.println("List of Ports ----> " + listOfPorts);
        System.out.println("Operating System ----> " + os);
    }
}
public class Practical_3_1_5 {
    public static void main(String[] args) {
        Laptop lpt = new Laptop();
        Laptop lpt2 = new Laptop(122828929292342d,"AMD - RYZEN 7 5600G GAMING PROCESSOR",3.80f,"RAM",16,"ROM",1,"1920 x 2160","o-led","Yes","HDMI, USB - 2, CHARGING PORT","windows - 10");
        Laptop lpt3 = new Laptop();
        lpt3.setImei(122828929292342d);
        lpt3.setProcessor("AMD - RYZEN 7 5600G GAMING PROCESSOR");
        lpt3.setProcessor_speed(3.80f);
        lpt3.setPrimary_mem_type("RAM");
        lpt3.setPrimary_mem_cap(16);
        lpt3.setSecondary_storage_type("ROM");
        lpt3.setSecondary_storage_capacity(1);
        lpt3.setScreen_resolution("1920 X 2160");
        lpt3.setScreen_type("O-LED");
        lpt3.setIsLED("YES");
        lpt3.setListOfPorts("HDMI, USB - 2, CHARGING PORT");
        lpt3.setOs("Windows - 11");

        lpt.print();
        System.out.println();
        lpt2.print();
        System.out.println();
        lpt3.print();
    }
}
