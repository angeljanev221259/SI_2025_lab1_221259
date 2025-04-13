import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;


    public TaskManager() {
        tasks = new ArrayList<>();
    }


    public void addTask(String name, boolean completed) {
        tasks.add(new Task(name, completed));
    }


    public void markTaskAsCompletedByName(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                task.setCompleted(true); 
                break; 
            }
        }
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getName() + ", Completed: " + task.isCompleted());
        }
    }
}
