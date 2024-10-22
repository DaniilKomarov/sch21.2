package org.example;

import java.util.concurrent.TimeUnit;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name,age);
    }
    @Override
    public String toString() {
        return "Dog name = " + getName() + ", age = " + getAge();
    }

    @Override
    public double goToWalk() {
        double timeWalk = getAge() * 0.5;
        TimeUnit time = TimeUnit.MILLISECONDS;
        try {
            time.sleep((long) (timeWalk*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return timeWalk;
    }
}
