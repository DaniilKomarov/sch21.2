package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
                if(type.equals("cat")){
                    animalList.add(new Cat(name,age));
                }else if(type.equals("dog")){
                    animalList.add(new Dog(name,age));
                }
            } catch (NumberFormatException e) {
                i--;
                System.out.println("Couldn't parse a number. Please, try again");
            }
        }
        List<Thread> threads = new ArrayList<>();
        long startProc = System.currentTimeMillis();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(Animal animal : animalList){
            Thread thread = new Thread(()-> {long startWalk = System.currentTimeMillis();
            double walkTime = animal.goToWalk();
            long endWalk = System.currentTimeMillis();
            System.out.printf(animal + " ,start time = %.2f, end time = %.2f \n" , ((startWalk-startProc)/1000.0)
                    ,((endWalk - startProc)/1000.0));});
            threads.add(thread);
            thread.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        scanner.close();
    }
}