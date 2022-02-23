package org.example;

public class Cat extends Dog implements Animal {

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    public Cat() {
    }
    @Override
    public void animalPlus() {
        System.out.println(getName()+"  Озу мн озу журо берет");
    }

    @Override
    public void animalMinus() {
        System.out.println(getName()+"  аймап алышы мумкун");

    }


    @Override
    public String toString() {
        return "Cat{}";
    }
}
