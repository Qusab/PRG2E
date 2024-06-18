package oop.Practice;

public class User {
    String name;
    String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}
