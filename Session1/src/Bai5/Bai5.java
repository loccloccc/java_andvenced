package Bai5;

import Bai3.User;

import java.util.Scanner;

public class Bai5 {
    static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap tuoi : ");
            int age = sc.nextInt();
            user.setAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("thuc hien cac thao tac khac");
        }
    }
}
