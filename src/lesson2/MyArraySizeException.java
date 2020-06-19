package lesson2;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Ввели некорректный формат массива");
    }
}