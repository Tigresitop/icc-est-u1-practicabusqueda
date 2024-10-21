package controllers.Controller;

import javax.swing.text.View;

import controllers.SortingMethods;
import models.Models.Person;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods  searchMethods;
    private Person[] persons;

    public Controller(View view, SortingMethods sortingMethods,  SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controlador Creado");
    }

    public void star(){
        int option = 0;
        do{
            option  = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                case 100;
                    System.out.println("Adios");
                    break;
                default:
                System.out.println("Opción no válida");
        }while(option != 0);
        }


    public void inputPersons(){
        int numeroPersonas  = view.inputInt("Ingrese el numero de personas:");
        persons = new Person[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            persons[i] = view.inputPerson();
        }
    }

    public void addPerson(){
        int numeroPersonas  = view.inputInt("Ingrese el numero de personas a adicionar:");

        Person[]  personasTotales = new Person[personas.lenght +  numeroPersonas];

        for (int i = 0; i < personas.length; i++) {
            personasTotales[i] = persons[i];
        }


    }
}
