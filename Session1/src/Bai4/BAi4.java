package Bai4;

import java.io.IOException;

public class BAi4 {
    public static void saveFile() throws IOException{
        throw new IOException("Luu file thanh cong");
    }
    public static void processUserData() throws IOException{
        saveFile();
    }

    static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
