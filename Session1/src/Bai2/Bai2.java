package Bai2;

import java.util.Scanner;

public class Bai2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("nhap tong so nguoi dung : ");
            int totalPerson = sc.nextInt();

            System.out.println("nhap so nhom : ");
            int group = sc.nextInt();

            System.out.println(" 1 nhom co : " + (totalPerson / group));
        }catch (ArithmeticException a){
            System.out.println("Khong the chia het cho 0 ");
        }
        finally {
            sc.close();
            System.out.println("Chay cac luong lenh phia sau");
        }
    }
}
