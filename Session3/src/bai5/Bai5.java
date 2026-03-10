package bai5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bai5 {
    public record User(String name){}
    static void main(String[] args) {
        List<User> userList = List.of(
                new User("Loc"),
                new User("Alexander"),
                new User("Christopher"),
                new User("An"),
                new User("Jonathan")
        );

        userList.stream()
                .sorted(Comparator.comparingInt((User e) ->e.name().length()).reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.name()));
    }
}
