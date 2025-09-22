import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        String[] cc = {"stone","papper","scissor"};


        String userc;
        String run = "yes";
        do{
            int randn = random.nextInt(3);
            System.out.printf("Enter your choice (stone, papper, scissor) : ");
            userc = scanner.nextLine().toLowerCase();

            System.out.println("System's choice: "+cc[randn]);

            if (cc[randn].equals(userc)) {
                System.out.println("Tie !!");
            } else if (cc[randn].equals("stone") && userc.equals("papper") || cc[randn].equals("scissor") &&
            userc.equals("stone") || cc[randn].equals("papper") && userc.equals("scissor")) {
                System.out.println("You win !!");
            }
            else {
                System.out.println("You lost !!");
            }
            System.out.print("Do you want to continue (yes / no) : ");
            run = scanner.nextLine().toLowerCase();
        }while (run.equals("yes"));

        System.out.println("Thank you!!");
        scanner.close();


    }
}