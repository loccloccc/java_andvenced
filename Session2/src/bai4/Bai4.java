package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Bai4 {

    static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Loc"));
        users.add(new User("Long"));
        users.add(new User("Linh"));
        users.add(new User("Lan"));

        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        Supplier<User> supplier = User::new;
        User newUser = supplier.get();
        System.out.println(newUser.getName());
    }
}
