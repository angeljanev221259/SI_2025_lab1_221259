import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.getName());
        }
    }

    public void removeTaskByName(String taskName) {
        boolean removed = tasks.removeIf(task -> task.getName().equals(taskName));
        if (removed) {
            System.out.println("Task '" + taskName + "' removed.");
        } else {
            System.out.println("Task '" + taskName + "' not found.");
        }
    }
}
