import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int quantity;
        int total;
        String items = "1.Pizza\n 2.Burger\n 3.coke\n 4.Cappachino\n 5.Chai";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Avilable items\n"+items);
        System.out.println("What item would you like to buy (Type thier num): ");
        int order = scanner.nextInt();
        if(order == 1)
        {
            int pricepi = 144;
            System.out.println("The price of Pizza is "+pricepi+" Rupees");
            System.out.print("Enter the quantity of Pizza: ");
            quantity = scanner.nextInt();
            total = quantity * pricepi;
            System.out.println("Your total Bill is "+total);
            System.out.println("Thank you, Visit again!!");
        }
        else if (order == 2) {
            int pricebu = 69;
            System.out.println("The price of burger is "+pricebu+" Rupees");
            System.out.println("Enter the quantity of Burger: ");
            quantity = scanner.nextInt();
            total = quantity * pricebu;
            System.out.println("Your total Bill is "+total);
            System.out.println("Thank you, Visit again!!");
        }
        else if (order == 3) {
            int priceco = 59;
            System.out.println("The price of Coke is "+priceco+" Rupees");
            System.out.println("Enter the quantity of Coke: ");
            quantity = scanner.nextInt();
            total = quantity * priceco;
            System.out.println("Your total Bill is "+total);
            System.out.println("Thank you, Visit again!!");
        }
        else if (order == 4) {int priceca = 188;
            System.out.println("The price of Cappachino is "+priceca+" Rupees");
            System.out.println("Enter the quantity of Capachino: ");
            quantity = scanner.nextInt();
            total = quantity * priceca;
            System.out.println("Your total Bill is "+total);
            System.out.println("Thank you, Visit again!!");
        }
        else {
            int pricech = 20;
            System.out.println("The price of Chai is "+pricech+" Rupees");
            System.out.println("Enter the quantity of chai: ");
            quantity = scanner.nextInt();
            total = quantity * pricech;
            System.out.println("Your total Bill is "+total);
            System.out.println("Thank you, Visit again!!");
        }
        scanner.close();
    }
}