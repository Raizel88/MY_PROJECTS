//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Spongbob", 30, 3.2);
    Student student2 = new Student("Patric", 22, 3.1);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.cgpa);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.cgpa);

        Student student3 = new Student("sandy", 24, 4.0);

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.cgpa);

        User user1 = new User("Rajath","Rajathshetty882@gmail.com",20);
        User user2 = new User("Ravi");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);



    }
}