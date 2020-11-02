/*
Test (Наследник Task, реализует интерфейс Autochecked)
Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку на массив {“a”, “b”, “c”}
 */

public class Test extends Task implements Autochecked {

    String[] arrAnswer = {"a", "b", "c"}; // Массив с ответами

    public Test(int number, String textTask) {
        super(number, textTask);
        this.arrAnswer = arrAnswer;
    }


}
