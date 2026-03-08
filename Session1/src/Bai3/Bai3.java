package Bai3;

import Bai5.InvalidAgeException;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.Scanner;

public class Bai3 {
    static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap tuoi : ");
            int age = sc.nextInt();
            user.setAge(age);
            System.out.println("Tuoi : " + user.getAge());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Thuc hien cac dong lenh khac");
        }
    }
}
