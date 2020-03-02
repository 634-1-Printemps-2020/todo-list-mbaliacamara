import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException{
        //System.out.println("test");

        Task task1 = null;
        Task task2 = null;
        Task task3 = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date date = formatter.parse("10.03.2020");
            Date date2 = formatter.parse("20.03.2020");
            task1 = new Task("Lia", "Payer son loyer et Faire les courses", date);
            System.out.println(task1);
            task2 = new Task("Krys", "Réserver les billets d'avion", date2);
            System.out.println(task2);
            task3 = new Task("Momo", "Sortir avec les collègues et les amies...", date);
            System.out.println(task3);

            ToDoList myList = new ToDoList();
            myList.addTask(task1);
            myList.addTask(task2);
            myList.addTask(task3);


        }catch (ValidateTaskException e){

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
