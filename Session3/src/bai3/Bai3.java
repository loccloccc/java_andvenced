package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bai3 {
    public record User(String name){}

    static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Loc"));
        users.add(new User("Long"));
        users.add(new User("Dung"));

        Optional<User> user = users.stream().filter(e -> e.name.equals("Loc")).findFirst();

        if (user.isPresent()) System.out.println("welcom " + user.get().name());
        else System.out.println("Guest login");
    }
}
