import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        int score = 0;


        //Quiz
        System.out.println("\t\t\t!-------------------!----------------------!");
        System.out.println("\t\t\t\t\t\tJava Quiz Game");
        System.out.println("\t\t\t!-------------------!----------------------!\n\n");

        String[] questions = {
                "1.Who is the current Prime minister of India?.",
                "2.Who is Known as Father of Indian Constitution?.",
                "3.Who wrote Indian National Anthem?.",
                "4.Who is Known As IronMan of India?.",
                "5.Capital of India : .",
                "6.India is Known for its: .",
                "7.When does india become Independent?.",
                "8.India is Currently Celebrating it's ____th Independence.",
                "9.India's First Prime Minister ?.",
                "10.National Animal and Bird of India: ."

        };
        String[][] options ={
                {
                    "a.Jawahal lal Nehru",
                    "b.Narendra Modi",
                    "c.Rahul Gandi",
                    "d.Vajyapeyi"} ,
                {
                    "a.Bhagat sign",
                    "b.Babu Rajendra Prasad",
                    "c.Dr.B R Ambedkar",
                    "d.Bipin Rawat",
                },
                {
                    "a.Rabindranatha Thagore",
                        "b.Kuvempu",
                     "c.Purnachandra tejasvi",
                     "d.D V Gundappa"
                },
                {
                    "a.Dr. B R Ambedkar",
                        "b.Mahatma Gandi",
                        "c.Sardar Vallabhabhai Patel",
                        "d.Bhagat Singh"
                },
                {
                    "a.Bengaluru",
                    "b.New Delhi",
                    "c.Lucknow",
                    "d.kolkatta"
                },
                {
                    "a.Religion",
                     "b.Culture and Rich heritage",
                    "c.People",
                    "d.cities"
                },
                {
                  "a. August 15 1947",
                  "b.November 26 1945",
                  "c.Janvary 15 1946",
                  "d.August 10 1947"
                },
                {
                    "a.75th",
                    "b.60th",
                    "c.79th",
                    "d.82th"
                },
                {
                  "a.Lal bahuddur shastri",
                  "b.Jawaharlal nehru",
                  "c.Sarvapalli radaKrishnan",
                  "d.Bipin Rawat"
                },
                {
                    "a.Tiger and Peacock",
                        "b.Lion and Parrot",
                        "c.Elephant and Humming bird",
                        "d.Kangroo and Crow"

                }


        };
        String[] keys ={
                "b",
                "c",
                "a",
                "c",
                "b",
                "b",
                "a",
                "c",
                "b",
                "a"
        };

        for(int i = 0; i< questions.length;i++) {
            System.out.println("\t--------------------------------------------------------------------");
            System.out.print("\t" + questions[i] + "\n\n");

            for (int j = 0; j < 4; j++) {
                System.out.println("\t\t" + options[i][j] + "\n");
            }
            System.out.println("-------------------------------------------------------------------\n");
            System.out.print("\tEnter your choice: ");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals(keys[i])) {
                System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#\n");
                System.out.println("\t\tYour Answer is correct!!\n");
                System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#\n");
                score++;
            }
            else {
                System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#\n");
                System.out.println("\t\tYour Answer is Wrong!!\n");
                System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#\n");
            }

        }
        System.out.println("\t\t\t!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");
        System.out.println("\t\t\t\t\t3Total Score is "+score);
        System.out.println("\t\t\t!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");
        scanner.close();

    }
}