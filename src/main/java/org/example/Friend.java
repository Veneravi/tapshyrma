package org.example;

public class Friend extends Person{
    public Friend(String name, int age) {
        super(name, age);
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{}";
    }
}
