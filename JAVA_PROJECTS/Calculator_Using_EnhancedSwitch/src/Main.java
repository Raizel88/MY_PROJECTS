import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Basic Calculator using EnhancedSwitch

        int operator;
        int a;
        int b;
        int res;

        System.out.print("Operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        System.out.println("Enter the number of Operation You want to Perform: ");
        operator = scanner.nextInt();
        System.out.print("Enter Operator a: ");
        a = scanner.nextInt();
        System.out.print("Enter Operator b: ");
        b = scanner.nextInt();

        switch(operator)
        {
            case 1 ->{
               res = a+b;
            System.out.printf("Adding %d and %d is %d",a,b,res);
            }
            case 2->{
                res = a - b;
                System.out.printf("Subtracting %d from %d is %d",b,a,res);
            }
            case 3->{
                res = a*b;
                System.out.printf("Multiplying %d and %d us %d",a,b,res);
            }
            case 4->{
                res = a/b;
                System.out.printf("Dividing %d by %d is %d",a,b,res);
            }
        }
        scanner.close();
        }
    }
