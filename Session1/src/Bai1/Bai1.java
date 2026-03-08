package Bai1;

import java.util.Scanner;

public class Bai1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap nam sinh : ");
            String intput = sc.nextLine();
            int yearBirthDay = Integer.parseInt(intput);
            System.out.println("Tuoi : " + (2026 - yearBirthDay));


        }catch (NumberFormatException n){
            System.out.println("Vui long nhap so..");
        }
        finally {
            sc.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}
