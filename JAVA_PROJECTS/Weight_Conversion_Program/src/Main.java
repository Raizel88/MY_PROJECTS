import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Weight;
        int choice;
        double convertedw;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome!! This is a Weight Conversion program" +
                "\n Choices Avilable:-" +
                "\n 1.Kgs to Lbs" +
                "\n 2.Lbs to kgs" +
                "\n 3.Kgs to Grams" +
                "\n 4.Grams to kgs");
        System.out.print("\nEnter your Choice: ");
        choice = scanner.nextInt();
        if (choice == 1){
            System.out.print("Enter the Weight in Kg to be Converted into Lbs: ");
            Weight = scanner.nextDouble();
            convertedw = Weight * 2.20462262;
            System.out.printf("%.4f Kg is Converted into %.4f Lbs",Weight,convertedw);
        }
        else if (choice == 2){
            System.out.print("Enter the Weight in Lbs to convert into Kg: ");
            Weight = scanner.nextDouble();
            convertedw = Weight *0.45359237;
            System.out.printf("%.4f Lbs is Converted into %.4f Kgs",Weight,convertedw);
        }
        else if(choice == 3){
            System.out.print("Enter the Weight in Kg to Convert it into Grams: ");
            Weight = scanner.nextDouble();
            convertedw = Weight * 1000;
            System.out.printf("%.4f Kg is %.4f Grams");
        }
        else if (choice == 4){
            System.out.print("Enter the weight in Grams to convert It into Kg: ");
            Weight = scanner.nextDouble();
            convertedw = Weight/1000;
            System.out.printf("%.4f Grams are %.4f Kgs");
        }
        else  {
            System.out.println("Invalid Choice!!");
        }

    }
}