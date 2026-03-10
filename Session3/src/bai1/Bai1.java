package bai1;

import java.util.ArrayList;

public class Bai1 {
    public record User(String usename , String email , String Status){}

    static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Loc","loc@gmail.com","active"));
        users.add(new User("Long","long@yahho.com","inactive"));
        users.add(new User("Dung","dung@gmail.com","active"));

        users.parallelStream().forEach( e -> System.out.println(e.usename + " - " + e.Status.toUpperCase()));
    }
}
