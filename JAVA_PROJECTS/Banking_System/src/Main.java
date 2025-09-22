import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    static double balance ;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //JAVA BANKING PROGRAM FOR BEGINNER


        //DECLARE VARIABLE

        double value;
        boolean isRunning = true;
        int choice;

        //DISPLAY MENU
        System.out.println("***************");

        System.out.println("BANKING PROGRAM");

        System.out.println("***************");
        while (isRunning) {
            System.out.println("1.Show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.WithDraw");
            System.out.println("4.Credit");
            System.out.println("5.Exit\n");

            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();

            //GET AND PROCESS USER CHOICE

            switch (choice){
                case 1 ->{
                    System.out.printf("The balance in your account is %4.2f\n",showbal());
                }
                case 2 ->{
                    System.out.print("Enter Anount to Add: ");
                    value = scanner.nextDouble();
                    double tamount = addamount(value);
                    System.out.println("Amount added sucessfully!!");
                    System.out.printf("Total amount is %4.2f\n\n",tamount);

                }
                case 3 ->{
                    System.out.print("Enter Amount to Withdraw: ");
                    value = scanner.nextDouble();
                     double rb= withdraw(value);
                    System.out.printf("Amount %4.2f is withdrawn from your account and remaining balance is %4.2f\n\n",value,rb);
                }
                case 4 ->{
                    System.out.print("Enter amount to Credit: ");
                    value = scanner.nextDouble();
                    credit(value);
                }
                case 5 ->{
                    isRunning = false;
                }

            }

            //SHOW BALENCE//WITHDRAW

            //DEPOSIT

            //WITHDRAW


        }
        scanner.close();


    }
    static double showbal(){
        return balance;
    }
    static double addamount(double value){
        balance+=value;
        System.out.printf("The amount %4.2f is added and total balance is %4.2f\n",value,balance);
        return balance;

    }
    static double withdraw(double value){
        balance = balance - value;
        return balance;
    }
    static double credit(double value){
        balance+=value;
        System.out.printf("The amount %4.2f is Credited and total balance is %4.2f\n\n",value,balance);
        return balance;

    }
}