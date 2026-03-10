package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class demo_map {
    static void main(String[] args) {
        // tao danh sach luu ten
        List<String> list = Arrays.asList("Loc","Duy","Nam","Long");
        // duyet qua ds va chuyen thanh chu hoa
        list.stream().map(String::toUpperCase);
        list.stream().forEach(System.out::println);
        List<String> list2 = Arrays.asList("Duong Loc","Nguyen Duy","Nguyen Nam","Hoang Long");
        // lay va in ra ho nguyen
        list2.parallelStream().filter(name -> name.startsWith("Nguyen")).forEach(System.out::println);
        // dung sort
        System.out.println("sap xem tang dan");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("danh sach giam dan");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
