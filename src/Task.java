// Класс описывает задачу, которая даётся студенту для решения.

public abstract class Task {
    int number;
    String textTask;

    public Task(int number, String textTask) {
        this.number = number;
        this.textTask = textTask;
    }
}
