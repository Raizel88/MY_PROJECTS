import java.util.Scanner;
import java.util.Random;
public class Main {
    static int total;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isr = true;
        char pp = 'Y';
        while (isr) {

            int n;
            System.out.println("--------------------------------");
            System.out.println("Dice rolling Game");
            System.out.println("--------------------------------");
            System.out.println("\n");


            System.out.print("Do you want Continue (Y/N): ");
            pp = scanner.next().charAt(0);
            if (pp == 'Y') {
                System.out.print("Enter a number of Times You want to roll a dice: ");
                n = scanner.nextInt();
                System.out.print("\n");
                System.out.println("--------------------------------");

                working(n);
            } else if (pp == 'N') {
                isr = false;
            }
            else {
                System.out.println("Invalid Choice!!");
            }
        }
        scanner.close();
    }
    static void dice(int r){
        switch (r){
            case 1 ->{
                System.out.println("""
                        - - -
                      |       |
                      |   ●   |
                      |       |
                        - - -
                        """);
            }
            case 2 ->
            {
                System.out.println("""
                        - - -
                      | ●     |
                      |       |
                      |     ● |
                        - - -
                        """);
            }
            case 3 ->{
                System.out.println("""
                        - - -
                      | ●     |
                      |   ●   |
                      |     ● |
                        - - -
                        """);
            }
            case 4 ->{
                System.out.println("""
                        - - -
                      | ●   ● |
                      |       |
                      | ●   ● |
                        - - -
                        """);
            }
            case 5 ->{
                System.out.println("""
                        - - -
                      | ●   ● |
                      |   ●   |
                      | ●   ● |
                        - - -
                        """);
            }
            case 6 ->
            {
                System.out.println("""
                        - - - 
                      | ●   ● |
                      | ●   ● |
                      | ●   ● |
                        - - -
                        """);
            }

        }
    }
    static void working (int n){
        Random random = new Random();
        for (int i = 1 ; i <= n; i++ ){
            int r;
            r = random.nextInt(1, 7);
            total += r;
            dice(r);


        }
        System.out.print("Total: "+total+"\n");
        System.out.println("--------------------------------");
        total = 0;
        System.out.print("\n\n");
    }
}
