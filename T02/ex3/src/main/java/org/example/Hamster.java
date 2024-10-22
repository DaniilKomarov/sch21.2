package org.example;

public class Hamster extends Animal implements Herbivore{
    @Override
    public String toString() {
        return "Hamster name = " + getName() + ", age = " + getAge()
                +". " + chill();
    }

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public String chill() {
        return "I can chill for 8 hours";
    }
}
