import controllers.SortingMethods;
import controllers.Controller.Controller;
import controllers.Controller.SearchMethods;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
        //crear la vista
        View view = new View();

        //crear las clases con los metodos de ordenamiento y busqueda
        SortingMethods  sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        //crear contolador
        Controller controller = new Controller(null, sortingMethods, searchMethods);
        


        




    }
}
