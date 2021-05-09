package viktor.kucherov;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(int needRow, int needColumn, int actualRow, int actualColumn) {
        super(String.format("%nВ метод строкового двумерного массива размерностью [%d][%d] передан массив размерностью [%d][%d]%n",
                needRow,
                needColumn,
                actualRow,
                actualColumn));
    }

}

