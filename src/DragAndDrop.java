public class DragAndDrop extends Task implements Autochecked {
    String[][] options; // Варианты ответов

    public DragAndDrop(int number, String textTask, String[][] options) {
        super(number, textTask);
        this.options = options;
    }
}
