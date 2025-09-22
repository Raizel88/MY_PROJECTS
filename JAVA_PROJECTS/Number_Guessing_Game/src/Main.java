import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Number guessing Game


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0 ;
        int Randomnum = random.nextInt(1,101);

        System.out.println("Number Guessing Game");
        System.out.println("Guess the Number between 1-100");

        do{
            System.out.print("Guess a Number : ");
            guess = scanner.nextInt();

            attempts ++;

            if (guess < Randomnum){
                System.out.println("Too low, Try Again!!");
            } else if (guess > Randomnum) {
                System.out.println("Too high, Guess Again!!");
            }
        }while(guess != Randomnum);

        System.out.println("You have Won !!");
        System.out.println("You took "+ attempts+" attempts to Win!!");




    }
}