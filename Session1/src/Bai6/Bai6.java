package Bai6;

import Bai3.User;
import Bai5.InvalidAgeException;

public class Bai6 {
    static void main(String[] args) {
        User user = new User();
        try{
            user.setName("Chien");
            user.setAge(-5);

            user.printUser();
        } catch (InvalidAgeException e) {
            Logger.logError(e.getMessage());
        }

    }
}
