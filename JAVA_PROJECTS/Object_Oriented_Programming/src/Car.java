import java.sql.SQLOutput;

public class Car {
    String company = "Porche";
    int model = 911;
    int year = 2023;
    double price = 2.11;
    String unit = "Cr";
    boolean isrunning = false;

    void start(){
        isrunning = true;
        System.out.println("You start the engine!!");
    }

    void stop(){
        isrunning = false;
        System.out.println("You stop the engine!!");
    }

    void drive(){
        System.out.println("You drive the "+company+" "+model);
    }

}
