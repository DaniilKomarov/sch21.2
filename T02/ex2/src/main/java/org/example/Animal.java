package org.example;

public abstract class Animal {
    private String name;
    private int age;
    private double ves;

    public String getName() {
        return name;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, int age,double ves) {
        this.name = name;
        this.age = age;
        this.ves = ves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract String toString();
    public abstract double getFeedInfoKg();
}
