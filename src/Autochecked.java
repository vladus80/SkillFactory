// Интерфейс сспользуются, чтобы отметить задания, которые проверяются автоматически.

public interface Autochecked {

    // метод Выполнить задание - Печатает сообщение о том, что задание выполнено
    default void solvedTask(){
        System.out.println("Задание выполнено");
    }
}
