import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

public class ToDoListTest {
    Task task1 = null;
    Task task2 = null;
    Task task3 = null;
    Task task4 = null;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse("10.03.2020");
        Date date2 = formatter.parse("20.03.2020");
        task1 = new Task("Lia", "Payer son loyer et Faire les courses", date);
        System.out.println(task1);
        task2 = new Task("Krys", "Réserver les billets d'avion", date2);
        System.out.println(task2);
        task3 = new Task("Momo", "Sortir avec les collègues et les amies...", date);
        System.out.println(task3);

        task4 = new Task("Maou", "Réserver les billets", date);
        System.out.println(task4);

    }

    @Test
    public void addTask() throws ValidateTaskException {
        ToDoList myList = new ToDoList();
        myList.addTask(task1);
        myList.addTask(task2);
        myList.addTask(task3);
        myList.addTask(task4);

        Assert.assertEquals(4, myList.getCreateur().size());
        Assert.assertTrue(myList.getCreateur().contains(Arrays.asList("Lia", "Krys", "Momo", "Maou")));
        Assert.assertEquals(1, myList.getTasklistCreateur("Lia").size());


    }

    @Test
    public void removeTask() { }
}