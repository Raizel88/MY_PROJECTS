import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits= {"Apple"};
        for (int i = 0; i<fruits.length;i++){
            System.out.print("Enter fruit Name: ");
            fruits[i] = scanner.nextLine();
        }
        System.out.println(fruits[1]);


    }
}