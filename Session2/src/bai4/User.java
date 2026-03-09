package bai4;

public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = "name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
