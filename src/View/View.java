package View;

import java.util.Scanner;
import Models.Person;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    
    public int showMenu() {
        System.out.println("============ MENÚ PRINCIPAL ============");
        System.out.println("1. Ingresar personas");
        System.out.println("2. Agregar persona");
        System.out.println("3. Ordenar personas");
        System.out.println("4. Buscar persona");
        System.out.println("100. Salir");
        System.out.println("========================================");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Submenú de métodos de ordenamiento con formato claro
    public int selectSortingMethod() {
        System.out.println("===== MÉTODOS DE ORDENAMIENTO =====");
        System.out.println("1. Ordenar por Nombre (Burbuja)");
        System.out.println("2. Ordenar por Nombre (Selección)");
        System.out.println("3. Ordenar por Edad (Inserción)");
        System.out.println("4. Ordenar por Nombre (Inserción)");
        System.out.println("===================================");
        System.out.print("Seleccione un método: ");
        return scanner.nextInt();
    }

   
    public int selectSearchCriterion() {
        System.out.println("======= CRITERIOS DE BÚSQUEDA =======");
        System.out.println("1. Buscar por Edad");
        System.out.println("2. Buscar por Nombre");
        System.out.println("=====================================");
        System.out.print("Seleccione un criterio: ");
        return scanner.nextInt();
    }

    // Método para ingresar una persona
    public Person inputPerson() {
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

   
    public void displayPersons(Person[] personas) {
        System.out.println("=== Lista de Personas ===");
        for (Person person : personas) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona encontrada: " + person);
        } else {
            System.out.println("No se encontró ninguna persona con el criterio especificado.");
        }
    }
    
    public int inputAge() {
        System.out.print("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.print("Ingrese el nombre: ");
        return scanner.next();
    }

    public int inputInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
