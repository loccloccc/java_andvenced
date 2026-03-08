package demo_thorw_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TryCatch {
    static void main(String[] args) {
        Date birthday;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay sinh");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            birthday = sdf.parse(sc.nextLine());
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("Kieu ngay thang khong hop le");
        }
    }
}
