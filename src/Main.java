import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Создаем менторов
        Mentor mentor1 = new Mentor("Иванов", "Игорь", 30, true);
        Mentor mentor2 = new Mentor("Петров", "Сергей", 25, false);
        Mentor mentor3 = new Mentor("Сидоров", "Павео", 45, true);

        // Массив студентов
        Student[] students = new Student[3];
        students[0] = new Student("Федоров", "Никита", 25, mentor1, false);
        students[1] = new Student("Алексеев", "Тимур", 30, mentor2, true);
        students[2] = new Student("Васечкин", "Семен", 56, mentor3, true);


        // Создание Массива с заданиями
        String[][] options = {{"", ""}, {"", ""}, {"", ""}}; // Варианты заданий
        Task[] tasks = new Task[30]; // Тип интерфеса которые реализованы конкретными классами
        for (int i = 0; i < tasks.length; i++) {
            if (i < 15) {
                tasks[i] = new Test(i, "Задания " + i);
            } else {
                tasks[i] = new DragAndDrop(i, "Задание " + i, options);
            }
        }

        Random random = new Random();
        int min = 1;
        int max = 10;
        int diff = max - min;

        int randomTask = random.nextInt(diff + 1);
        System.out.println(randomTask);
        int i = 0;

        // Перебираем студентов и даем им задания
        for (Student student: students) {
            student.solveTasks(randomTask,tasks);
        }
    }
}
