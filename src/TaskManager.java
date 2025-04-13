import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    // Конструктор на TaskManager
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Метод за додавање нова задача
    public void addTask(String name, boolean completed) {
        tasks.add(new Task(name, completed));
    }

    // Метод за наоѓање на сите завршени задачи
    public List<Task> findAllCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    // Метод за печатење на сите задачи
    public void printTasks() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getName() + ", Completed: " + task.isCompleted());
        }
    }
}
