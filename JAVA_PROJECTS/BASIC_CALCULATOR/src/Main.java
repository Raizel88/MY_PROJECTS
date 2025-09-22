import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Basic Calculator which can perform basic integer addition,multiplication,division,subtraction with generation of Toss(Head or tail)

        int a;
        int b;
        int res;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Operation: Type C for Basic Calculator And T For toss: ");
        char choice = scanner.next().charAt(0);

        //choosing the Operation Part
        if (choice == 'C') {

            //Calculator
            System.out.print("Enter which operation do you have to perform (+,-,*,/) : ");
            char operator = scanner.next().charAt(0);
            if (operator == '+') {
                //Addition Operation
                System.out.print("Enter Operand A: ");
                a = scanner.nextInt();
                System.out.print("Enter Operand B: ");
                b = scanner.nextInt();
                res = a + b;
                System.out.println("Addition of " + a + " and " + b + " is " + res);
            }
            if (operator == '-') {
                System.out.print("Enter Operand A: ");
                a = scanner.nextInt();
                System.out.print("Enter Operand B: ");
                b = scanner.nextInt();
                res = a - b;
                System.out.println("Subtraction  of " + b + " from " + a + " is " + res);

            } else if (operator == '*') {
                System.out.print("Enter Operand A: ");
                a = scanner.nextInt();
                System.out.print("Enter Operand B: ");
                b = scanner.nextInt();
                res = a * b;
                System.out.println("Multiplication of " + a + " and " + b + " is " + res);
            } else {
                System.out.print("Enter Operand A: ");
                a = scanner.nextInt();
                System.out.print("Enter Operand B: ");
                b = scanner.nextInt();
                res = a / b;
                System.out.println("Division of " + a + " by " + b + " is " + res);
            }
        }

        if (choice == 'T') {
            //Toss Part

            Random random = new Random();
            Boolean Toss = random.nextBoolean();

            if (Toss) {
                System.out.println("You got a head!!");
            } else {
                System.out.println("You got a Tail!!");
            }

        }
    }
}





