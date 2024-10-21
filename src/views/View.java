package views;
import java.util.Scanner;

import models.Models.Person;

public class View {
    Scanner  scanner = new Scanner(System.in);


    public int showMenu(){
        System.out.println(" Menu ");
        System.out.println("1. Anadir usuario");
        System.out.println("100. Exit");
        System.out.println("Ingrese usuario");
        return scanner.nextInt();

    }

    public Person inputPerson(){
        String name = InputName;
        int age = inputAge;
        return new Person(name, age);
    }

    public int inputAge(){
        Scanner scanner  = new Scanner(System.in);
        

    }

    public int inputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        String age = inputAge();
        return  new Person(name,age);


        
    }

}
