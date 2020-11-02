import java.util.Random;

public class Mentor extends Person implements Staff {

    boolean modeMentor = true;
    Random random;

    public Mentor(String name, String surname, int age, boolean modeMentor) {
        super(name, surname, age);
        this.modeMentor = modeMentor;
    }

    // Проверить код
    public boolean checkCode(Task task){


        random = new Random();
        int ran = random.nextInt(); //любое случайное число

        if(ran > 1000){
            modeMentor = true;
            System.out.println("задача " + task.number +" не принята");
        }else {
            modeMentor = false;
            System.out.println("задача принята");
        }

        return modeMentor;

    }

    @Override
    public void supportStudent(Student student) {

        System.out.println("Надо стараться и все получится " + student.getName());

    }


}
