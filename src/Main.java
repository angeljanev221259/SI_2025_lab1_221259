public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Додавање неколку задачи
        manager.addTask(new Task("Do homework"));
        manager.addTask(new Task("Clean room"));
        manager.addTask(new Task("Go for a walk"));

        // Прикажи ги сите задачи
        System.out.println("Zadaci pred brisenje:");
        manager.listTasks();

        // Бришење задача по име
        manager.removeTaskByName("Clean room");

        // Прикажи ги сите задачи по бришење
        System.out.println("Zadaci posle brisenje:");
        manager.listTasks();
    }
}
