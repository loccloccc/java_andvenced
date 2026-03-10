package bai2;

import java.util.ArrayList;

public class Bai2 {
    public record User(String name , String email){}

    static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Loc" , "loc@gmail.com"));
        users.add(new User("Long" , "long@yahoo.com"));
        users.add(new User("Dung" , "dung@gmail.com"));
        users.parallelStream().filter(e -> e.email.endsWith("gmail.com")).forEach(e -> System.out.println(e.name));
    }
}
