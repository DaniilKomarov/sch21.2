package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Animal> animalList = new ArrayList<Animal>();
        for(int i=0;i<count;i++){
            try{
                String type = scanner.nextLine();
                if(!(type.equals("cat") || type.equals("dog") || type.equals("guinea") || type.equals("hamster"))){
                    System.out.println("Incorrect input. Unsupported pet type");
                    continue;
                }
                String name = scanner.nextLine();
                String ageStr = scanner.nextLine();
                int age = Integer.parseInt(ageStr);
                if(age <= 0 ){
                    System.out.println("Incorrect input. Age <= 0");
                    continue;
                }
                if(type.equals("cat")){
                    animalList.add(new Cat(name,age));
                }else if(type.equals("dog")){
                    animalList.add(new Dog(name,age));
                }else if(type.equals("hamster")){
                    animalList.add(new Hamster(name,age));
                }else if(type.equals("guinea")){
                    animalList.add(new GuineaPig(name,age));
                }
            } catch (NumberFormatException e) {
                i--;
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
        for (Animal an : animalList){
            if(an instanceof Herbivore) {
                System.out.println(an);
            }
        }
        for (Animal an : animalList){
            if(an instanceof Omnivore) {
                System.out.println(an);
            }
        }
        scanner.close();
    }
}