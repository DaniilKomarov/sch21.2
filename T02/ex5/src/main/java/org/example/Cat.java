package org.example;

import java.util.concurrent.TimeUnit;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat name = " + getName() + ", age = " + getAge();
    }

    @Override
    public double goToWalk() {
        double timeWalk = getAge() * 0.25;
        TimeUnit time = TimeUnit.MILLISECONDS;
        try {
            time.sleep((long) (timeWalk*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return timeWalk;
    }
}
