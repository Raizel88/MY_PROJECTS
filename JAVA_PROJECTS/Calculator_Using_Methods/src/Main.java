import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Calculator Using Method



        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        int choice;
        char c;


        System.out.print("//Calculator//");

        c = 'Y';




        while (c == 'Y'){

                System.out.print("Do you want to continue(Y/N):");
                c = scanner.next().charAt(0);
                c = Character.toUpperCase(c);


                System.out.print("Operations:-\n1.Addition\n2.Subtraction\n3.Multiplicaton" +
                        "\n4.Division\n5.Power\n6.Square\n7.SquareRoot\n\n");
                System.out.print("Enter your Choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Operator a: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter Operator b: ");
                        b = scanner.nextDouble();
                        addition(a, b);

                    }
                    case 2 -> {
                        System.out.print("Enter Operator a: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter Operator b: ");
                        b = scanner.nextDouble();
                        subtraction(a, b);
                    }
                    case 3 -> {
                        System.out.print("Enter Operator a: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter Operator b: ");
                        b = scanner.nextDouble();
                        multiplication(a, b);
                    }
                    case 4 -> {
                        System.out.print("Enter Operator a: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter Operator b: ");
                        b = scanner.nextDouble();
                        division(a, b);
                    }
                    case 5 -> {
                        System.out.print("Enter Base a: ");
                        a = scanner.nextDouble();
                        System.out.print("Enter Power b: ");
                        b = scanner.nextDouble();
                        powerof(a, b);
                    }
                    case 6 -> {
                        System.out.print("Enter number you want to find square: ");
                        a = scanner.nextDouble();
                        square(a);
                    }
                    case 7 -> {
                        System.out.print("Enter numnber to find Square root: ");
                        a = scanner.nextDouble();
                        sqrt(a);
                    }
                }
            }



        scanner.close();

    }
    static void addition(double a, double b){
        double res = a+b;
        System.out.printf("Addition of %.2f and %.2f is %.2f\n\n",a,b,res);
    }
    static void subtraction(double a, double b){
        double res = a-b;
        System.out.printf("Subtracting %.2f from %.2f is %.2f\n\n",b,a,res);
    }
    static void multiplication(double a, double b ){
        double res = a*b;
        System.out.printf("Multiplying %.2f and %.2f is %.2f\n\n",a,b,res);
    }
    static void division(double a,double b){
        double res = a/b;
        System.out.printf("Diving %.2f by %.2f is %.2f\n\n",a,b,res);
    }
    static void powerof(double a, double b){
        double res = Math.pow(a,b);
        System.out.printf("%.2f to the power of %.2f is %.2f\n\n",a,b,res);
    }
    static void square(double a){
        double res = Math.pow(a,2);
        System.out.printf("Square of %.2f is %.2f\n\n",a,res);
    }
    static void sqrt(double a){
        double res = Math.sqrt(a);
        System.out.printf("Square root of %.2f is %.2f\n\n",a,res);
    }
}