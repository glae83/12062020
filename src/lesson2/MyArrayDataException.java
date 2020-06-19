package lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j){
        super("Преобразовать не удалось из-за данных в ячейке (" + i + "," + j + ")");
    }
}
