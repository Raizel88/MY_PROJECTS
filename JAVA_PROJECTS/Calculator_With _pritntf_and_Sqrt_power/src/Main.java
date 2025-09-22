import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator With Square and SquareRoot");
        System.out.println("Options:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division" +
                "\n5.square \n6.SquareRoot");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();


        if (choice == 1){
            System.out.print("Enter Operator a: ");
            a = scanner.nextDouble();
            System.out.print("Enter Operator b: ");
            b = scanner.nextDouble();
            res = a+b;
            System.out.printf("adding %0.2f to %0.2f results in %0.2f",a,b,res);

        }
        if (choice == 2){
            System.out.print("Enter Operator a; ");
            a = scanner.nextDouble();
            System.out.print("Enter Operator b: ");
            b = scanner.nextDouble();
            res = a-b;
            System.out.printf("Subtracting %.2f from %.2f Gives %.2f",b,a,res);
        }
        if(choice == 3){
            System.out.print("Enter Operator a: ");
            a = scanner.nextDouble();
            System.out.print("Enter Operator b: ");
            b = scanner.nextDouble();
            res = a*b;
            System.out.printf("Multiplying %.2f with %.2f results in %.2f",a,b,res);

        }
        if (choice == 4){
            System.out.print("Enter Operator a: ");
            a = scanner.nextDouble();
            System.out.print("Enter Operator b: ");
            b = scanner.nextDouble();
            res = a/b;
            System.out.printf("Dividing %.2f by %.2f Will Result in %.2f",a,b,res);

        }
        if (choice == 5){
            System.out.print("Enter Base: ");
            a = scanner.nextDouble();
            System.out.print("Enter Power: ");
            b = scanner.nextDouble();
            res = Math.pow(a,b);
            System.out.printf("%04.2f to the Power of %04.2f is %04.2f",a,b,res);
        }
        if (choice == 6){
            System.out.print("Enter Value to Find SquareRoot: ");
            a = scanner.nextDouble();
            res = Math.sqrt(a);
            System.out.printf("The SquareRoot of %0.2f is %0.2f",a,res);


        }

        }
    }
