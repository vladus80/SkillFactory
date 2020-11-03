// Интерфейс используется для обучающего персонала.

public interface Staff {

    // Помочь студенту
    void supportStudent(Student student);

    // Дать дополнительный материалы (ссылка на Хабр)
    default void addKnow(String linkHabr){
        System.out.println(linkHabr);

    }

}
