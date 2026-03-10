package bai6;

import bai4.User;

public class Bai6 {
    static void main(String[] args) {
        User user = new User("loc");


        UserProcessor processor = UserUtil::convertToUpperCase;

        String result = processor.process(user);

        System.out.println(result);
    }
}
