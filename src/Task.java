import java.util.Date;

public class Task {
    private String createur;
    private String description;
    private Date date;
    private Status status;
    private Resolution resolution;


    public Task(String createur, String description, Date date) throws ValidateTaskException {
        this.createur = createur;
        this.description = description;
        this.date = date;
        status = Status.OPEN;
        accomplishTask(description, date);
    }


    public void accomplishTask(String description, Date date) throws ValidateTaskException {
        if (date.before(new Date())){
            throw new ValidateTaskException("Date antérieure à celle d'aujourd'hui");
        }

        if (description.length() <= 5){
            throw new ValidateTaskException("La description doit être supérieur ou égal à 5");
        }
    }

    public String getCreateur() {
        return createur;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Task{" +
                "createur='" + createur + '\'' +
                ", description='" + description + '\'' +
                ", date=" +  date +
                ", status=" + status +
                ", resolution=" + resolution +
                '}';
    }
}
