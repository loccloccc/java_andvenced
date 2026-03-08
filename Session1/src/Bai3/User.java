package Bai3;

import Bai5.InvalidAgeException;

public class User {
    protected int age;

    public User(int  age) {
        this.age = age;
    }

    public User() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age > 0){
            this.age = age;
        }else throw new InvalidAgeException("Tuoi khong duoc am");
    }
}
