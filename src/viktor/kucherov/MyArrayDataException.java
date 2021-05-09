package viktor.kucherov;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int row, int col, String element) {
        super(String.format("%nВ массив для преобразования в число был передан неподходящий элемент [%d][%d] содержащий %s%n",
                row,
                col,
                element));
    }
}
