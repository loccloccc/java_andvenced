package Bai2;

import java.util.Scanner;

public class Bai2 {
    static void main(String[] args) {
        PasswordValidator passwordValidator = pass -> pass.length() >= 8;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (passwordValidator.isValid(input)){
            System.out.println("true");
        }else System.out.println("false");
    }
}
