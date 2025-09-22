import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        int i;
        int j;
        char value;

        System.out.print("Enter the number of Rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of Columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter Symbol: ");
        value = scanner.next().charAt(0);

        for(i =0 ; i< rows;i++){
            for (j = 0 ; j<columns;j++){
                System.out.print(value+" ");
            }
            System.out.println();
        }

    }
}
