package viktor.kucherov;
// 1. Напишите метод, на вход которого подаётся двумерный
// строковый массив размером 4х4, при подаче массива другого размера
// необходимо бросить исключение MyArraySizeException.

// 2. Далее метод должен пройтись по всем элементам массива,
// преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException,
// с детализацией в какой именно ячейке лежат неверные данные.

// 3. В методе main() вызвать полученный метод,
// обработать возможные исключения MySizeArrayException и MyArrayDataException,
// и вывести результат расчета.



public class Main {





    public static void main(String[] args) {

        String[][] correctArray = new String[][]{
                {"1", "-2", "-3", "-4"},
                {"2", "4", "6", "8"},
                {"3", "9", "27", "5"},
                {"4", "0", "0", "0"}};

        String[][] arrayForMyArraySizeException = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"0", "0", "0", "0"},
                {"0", "0", "0", "0"}};

        String[][] arrayForMyArrayDataException = new String[][]{
                {"t", "e", "x", "t"},
                {"t", "e", "x", "t"},
                {"t", "e", "x", "t"},
                {"t", "e", "x", "t"}};

        String[][][] threeArraysForSum = {
                correctArray,
                arrayForMyArraySizeException,
                arrayForMyArrayDataException}
                ;

        for (String[][] arrays : threeArraysForSum) {
            tryToSumArrayElements(arrays);
        }


    }

    public static void tryToSumArrayElements(String[][] arr) {
        int sum = 0;
        try {
            sum = sumArrayElements(arr);
            System.out.format("Сумма элементов массива равна: %d%n", sum);
        } catch(MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();

        }

    }


    public static int sumArrayElements(String[][] arr)
            throws
            MyArraySizeException,
            MyArrayDataException
    {
        if(arr.length > 4 || arr[0].length > 4) {
            throw new MyArraySizeException(4, 4, arr.length, arr[0].length);
        }
        int sum = 0;
        int temp = 0;

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {

                if (!isNumeric(arr[row][col])) {
                    throw new MyArrayDataException(row, col, arr[row][col]);
                }
                temp = Integer.parseInt(arr[row][col]);
                sum += temp;
            }
        }
        return sum;
    }

    public static boolean isNumeric(String s) {
        return s.matches("-?\\d+");
    }

}
