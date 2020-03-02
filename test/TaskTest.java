import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void validData() throws ParseException, ValidateTaskException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse("03.03.2020");

        Task task = new Task("Julie", "Appeler ses parents", date);
        Assert.assertEquals( "Julie", task.getCreateur());
        Assert.assertEquals("Appeler ses parents", task.getDescription());
    }

    @Test(expected = ValidateTaskException.class)
    public void invalidData() throws ParseException, ValidateTaskException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse("03.02.2020");
        new Task("Alexandre", "Faire les courses", date);
    }
}