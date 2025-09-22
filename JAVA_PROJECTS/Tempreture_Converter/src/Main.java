import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempreture;
        double newtemp;
        String unit;

        System.out.print("Enter the tempreture: ");
        tempreture = scanner.nextDouble();

        System.out.print("Convert to Celsius of Farenheit ? (C or F); ");
        unit = scanner.next().toUpperCase();

        //Using Ternary Operator
        newtemp = (unit.equals("C")) ? (tempreture-32)*5/9 : (tempreture*5/9)+32;
        System.out.printf("%.1f° %s",newtemp,unit);

    }
}