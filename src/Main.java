import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создавање на TaskManager
        TaskManager taskManager = new TaskManager();
        
        // Додавање на неколку задачи
        taskManager.addTask("Do homework", true);   // Задачата е завршена
        taskManager.addTask("Clean room", false);   // Задачата не е завршена
        taskManager.addTask("Go for a walk", true); // Задачата е завршена
        
        // Наоѓање на завршените задачи
        List<Task> completedTasks = taskManager.findAllCompletedTasks();
        
        // Печатење на завршените задачи
        System.out.println("Completed tasks:");
        for (Task task : completedTasks) {
            System.out.println(task.getName());
        }
    }
}
