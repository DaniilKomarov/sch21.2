package org.example;

public class Cat extends Animal {

    public Cat(String name, int age,double ves) {
        super(name, age,ves);
    }

    @Override
    public String toString() {
        return "Cat name = " + getName() + ", age = " + getAge()+ ",mass="
                + getVes() + ",feed="+ getFeedInfoKg();
    }

    @Override
    public double getFeedInfoKg() {
        return getVes()*0.1;
    }
}
