public class Task {
    private String name;
    private boolean completed;

    // Конструктор
    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    // Гетери и сетери
    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
