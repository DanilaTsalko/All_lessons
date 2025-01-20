package lesson_11;

// Класс исключения для проверки размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Класс исключения для проверки данных массива
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    // Метод обработки массива
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: требуется массив 4x4.");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверный размер массива: требуется массив 4x4.");
            }
        }

        int sum = 0; // Сумма всех чисел в массиве
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ошибка в данных массива: неверный элемент в ячейке [" + i + "][" + j + "]."
                    );
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "A", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Обработка корректного массива
        try {
            int result = processArray(correctArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Обработка массива с неправильным размером
        try {
            int result = processArray(incorrectSizeArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Обработка массива с некорректными данными
        try {
            int result = processArray(incorrectDataArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
