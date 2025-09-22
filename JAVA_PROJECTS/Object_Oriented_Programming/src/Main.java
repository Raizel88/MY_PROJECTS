//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.company);
        System.out.println(car.isrunning);
        car.isrunning = false;
        System.out.println(car.isrunning);
        car.stop();
        car.drive();

    }
}