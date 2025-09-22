import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int res;
        int op;
        int a;
        int b;

        System.out.println("Options Avilable :- 1.Basic Calculator \n 2.Random Number Generator");
        System.out.print("Enter Choice You want: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Operations :- 1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)");
            System.out.print("Enter your Choice: ");
            op = scanner.nextInt();

            System.out.print("Enter Operand A: ");
            a = scanner.nextInt();

            System.out.print("Enter Operand B: ");
            b = scanner.nextInt();

            if (op == 1){
                res = a+b;
                System.out.println("Adding "+a+" To "+b+" Will be "+res);
            }
            if (op == 2){
                res = a-b;
                System.out.println("Subtracting "+b+" from "+a+" Will be "+res);
            }
            if (op == 3){
                res = a*b;
                System.out.println("Multiplying "+a+" And "+b+" Will result in "+res);
            }
            if (op == 4){
                res = a/b;
                System.out.println("Dividing "+a+" from "+b+" Will be "+res);
            }
        }
        if (choice == 2){
            Random random = new Random();
            System.out.println("Type of Random Number genration:- \n1.Random number between two numbers" +
                    "\n2.Random number Under given value\n" +
                    "3.Any random number without any limit(But integer)");
            op = scanner.nextInt();
            if (op == 1){
                System.out.print("Enter Random Num Lower Limit: ");
                a = scanner.nextInt();
                System.out.print("Enter Random Num Upper Limit: ");
                b = scanner.nextInt();
                int ran = random.nextInt(a,b);
                System.out.println("Random Number Generate is: "+ran);
            }
            if (op == 2){
                System.out.print("Enter Upper limit of Random Number: ");
                a = scanner.nextInt();
                int ran = random.nextInt(a);
                System.out.println("Random Number Generate is: "+ran);
            }
            if (op ==3){
                System.out.println("Random number without any limit (Integer)");
                int ran = random.nextInt();
                System.out.println("Random Number Generate is: "+ran);
            }
        }

        }
    }
