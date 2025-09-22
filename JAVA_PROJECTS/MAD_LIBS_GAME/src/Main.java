import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);
        String adj;
        String adj1;
        String adj2;
        String noun;
        String verb;

        System.out.println("Enter an adjective (Adjective): ");
        adj = scanner.nextLine();

        System.out.println("Enter a noun (Animal or Person): ");
        noun = scanner.nextLine();

        System.out.println("Enter an Adjective(Description): ");
        adj1 = scanner.nextLine();

        System.out.println("Enter a verb end with -ing (Action): ");
        verb = scanner.nextLine();

        System.out.println("Enter a adjective (DEscription): ");
        adj2 = scanner.nextLine();


        System.out.println("Today i went to a "+ adj+" Zoo.");
        System.out.println("In an exibit, I saw a "+noun+".");
        System.out.println(noun+" was "+adj2+" and "+verb);
        System.out.println("I was "+adj2+"!");
        scanner.close();
        }
    }