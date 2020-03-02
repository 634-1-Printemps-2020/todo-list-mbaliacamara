import java.util.*;

public class ToDoList {

    private Map<String, List<Task>> lstTask = new HashMap<>();

    public ToDoList() { }

    public void addTask(Task task){
        if(!lstTask.containsKey(task.getCreateur())){
            lstTask.put(task.getCreateur(), new ArrayList<>());
        }
        lstTask.get(task.getCreateur()).add(task);
    }

    public void removeTask(Task task){ }

    @Override
    public String toString() {
        return "ToDoList{" +
                "lstTask=" + lstTask +
                '}';
    }

    public Set<String> getCreateur() {
        return lstTask.keySet();
    }

    public List<Task> getTasklistCreateur(String createur) {
        return lstTask.get(createur);
    }
}
