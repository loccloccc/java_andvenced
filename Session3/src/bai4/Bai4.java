package bai4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai4 {
    public record User(String name){}

    static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Loc"));
        users.add(new User("Loc"));
        users.add(new User("Long"));
        users.add(new User("Dung"));
        users.add(new User("Long"));
        users.add(new User("Hoang"));

        Set<User> set = new HashSet<>();
        users.parallelStream().forEach(e -> set.add(new User(e.name)));
        set.parallelStream().forEach(e -> System.out.println(e.name));
    }
}
