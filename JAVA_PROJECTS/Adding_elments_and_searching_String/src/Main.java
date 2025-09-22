
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int target;

        System.out.print("------------------------------------\n");
        System.out.print("Enter the number of elements: ");
        boolean rr = true;
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("\n");
        while(rr) {
            System.out.print("Options\n1.Enter elements to array" +
                    "\n2.search Element\n3.Show all elements\n4.Exit");
            System.out.print("\n------------------------------------\n");
            System.out.print("Enter your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {


                    for (int i = 0; i < n; i++) {

                        System.out.print("Enter Elements: ");
                        array[i] = scanner.nextInt();

                    }
                }
                case 2 -> {
                    System.out.print("Enter Element to search: ");
                    target = scanner.nextInt();
                    int res = search(array, target);
                    if (res == -1) {
                        System.out.println("Element " + target + " is not found\n");

                    } else {
                        System.out.printf("Element %d is found at index %d\n", target, res);
                    }
                }
                case 3 ->{
                    traverse(array);
                }

                case 4-> {
                    rr = false;
                }
            }
        }


    }

    static int search(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {


            if (num[i] == target) {

                return i;
            }

        }
            return -1;


    }
    static void traverse(int[] num){
        for (int i = 0; i<num.length;i++){
            System.out.printf(num[i]+"\t");
        }
        System.out.println("\n");
    }

}