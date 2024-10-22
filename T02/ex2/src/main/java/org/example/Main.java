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
                if(!(type.equals("cat") || type.equals("dog"))){
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
                String massStr = scanner.nextLine();
                double mass = Double.parseDouble(massStr);
                if(mass <= 0 ){
                    System.out.println("Incorrect input. Mass <= 0");
                    continue;
                }
                if(type.equals("cat")){
                    animalList.add(new Cat(name,age,mass));
                }else if(type.equals("dog")){
                    animalList.add(new Dog(name,age,mass));
                }
            } catch (NumberFormatException e) {
                i--;
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
        for (Animal an : animalList){
            System.out.println(an);
        }
        scanner.close();
    }
}