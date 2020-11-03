import java.util.Objects;

public class Student extends Person {

    int countTasksDone; // Количество решенных задач
    static int countTaskDoneAllStudents; // Количество решенных задач всеми студентами
    Mentor mentor; // Ментор
    boolean checkTaskAllDone; // Флаг, что студент решил все задания

    public Student(String name, String surname, int age, Mentor mentor, boolean checkTaskAllDone) {
        super(name, surname, age);
        this.countTasksDone = 0;
        this.mentor = mentor;
        this.checkTaskAllDone = checkTaskAllDone;

    }

    //Метод  Решить задачи
    public void solveTasks(int countTask, Task[] tasks) {

        // Задаем цикл с колчиством задач студенту, сколько он должен решить
        for (int i = countTasksDone; i < countTask; i++) {

            solveTask(tasks[i]); // Вызываем метод решения задачи
            // Если количество задач устанавливается равным решеных задач,
            // устанавливаем флаг checkTaskAllDone в true, bначе false
            if (i == countTasksDone -1) {
                checkTaskAllDone = true;
                //System.out.println("Студент " + getName() + " решил задание " + tasks[i].number);
                System.out.println("Студент " + getName() + " решил задание " + tasks[i].number);
            } else {
                checkTaskAllDone = false;
                //System.out.println("Студент " + getName() + " решил не все задания");
            }

        }

        // Если checkTaskAllDone то значит все задачи решены
        if(checkTaskAllDone){
            System.out.println("Студент " + getName() + " решил  все задания");

        }else {

            System.out.println("Студент " + getName() + " решил не все задания");
        }
        //System.out.println(countTasksDone);

    }

    // Решить задачу
    private void solveTask(Task task) {

        if (task instanceof Autochecked) {
            ((Autochecked) task).solvedTask();
            countTasksDone +=1;
            countTaskDoneAllStudents = +1;
        } else {
            boolean checkCode = false;
            while (checkCode != true) {

                if (mentor.checkCode(task) == true) {
                    countTasksDone +=1;
                    countTaskDoneAllStudents = +1;
                    checkCode = true;

                }
            }
        }
    }

    public int getCountTasksDone() {
        return countTasksDone;
    }

    public void setCountTasksDone(int countTasksDone) {
        this.countTasksDone = countTasksDone;
    }

    public static int getCountTaskDoneAllStudents() {
        return countTaskDoneAllStudents;
    }

    public static void setCountTaskDoneAllStudents(int countTaskDoneAllStudents) {
        Student.countTaskDoneAllStudents = countTaskDoneAllStudents;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isCheckTaskAllDone() {
        return checkTaskAllDone;
    }

    public void setCheckTaskAllDone(boolean checkTaskAllDone) {
        this.checkTaskAllDone = checkTaskAllDone;
    }
}
