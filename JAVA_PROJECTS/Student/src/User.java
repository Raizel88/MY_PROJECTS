public class User {
    String username;
    String email;
    int age;

    User(String a, String b, int d){
        this.username = a;
        this.email = b;
        this.age = d;

    }
    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

}
