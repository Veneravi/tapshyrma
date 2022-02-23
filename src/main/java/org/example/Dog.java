package org.example;

public class Dog implements Animal{

    private String name;
    private int age;
    private String breed;


    @Override
    public void animalPlus() {
        System.out.println(name+"  Адамга жакын");
    }

    @Override
    public void animalMinus() {
        System.out.println(name+"  тиштеп алышы мумкун");

    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
