package org.example;

public class Dog extends Animal{
    public Dog(String name, int age,double ves){
        super(name,age,ves);
    }
    @Override
    public String toString() {
        return "Dog name = " + getName() + ", age = " + getAge() + ",mass="
                + getVes() + ",feed="+ getFeedInfoKg();
    }

    @Override
    public double getFeedInfoKg() {
        return getVes()*0.3;
    }
}
