import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principle;
        double rate;
        int timescompounded;
        int years;
        double amount;
        System.out.print("Enter the Principle Amount: ");
        principle = scanner.nextDouble();
        System.out.print("Enter the intrest rate (%): ");
        rate = scanner.nextDouble()/100;
        System.out.print("Enter the number time Compounded per year: ");
        timescompounded = scanner.nextInt();

        System.out.print("Enter the Years: ");
        years = scanner.nextInt();

        amount = principle*Math.pow(1+ rate/timescompounded,timescompounded*years);
        System.out.printf("The Amount After the %d is: %.3f Rupees",years,amount);

        scanner.close();



        }
    }
