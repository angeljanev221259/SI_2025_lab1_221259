public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Do homework", false);
        taskManager.addTask("Clean room", false);
        taskManager.addTask("Go for a walk", false);

        System.out.println("Tasks before completion:");
        taskManager.printTasks();

        taskManager.markTaskAsCompletedByName("Clean room");

        System.out.println("\nTasks after completion:");
        taskManager.printTasks();
    }
}
