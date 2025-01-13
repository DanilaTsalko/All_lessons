package lesson_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Проверка суммы в диапазоне
        System.out.println("1. Сумма в диапазоне:");
        System.out.println(IsSumInRange.isSumInRange(7, 5)); // true
        System.out.println(IsSumInRange.isSumInRange(10, 15)); // false

        // 2. Проверка знака числа
        System.out.println("\n2. Проверка знака числа:");
        CheckNumberSign.checkNumberSign(-5); // Negative
        CheckNumberSign.checkNumberSign(0);  // Positive
        CheckNumberSign.checkNumberSign(7);  // Positive

        // 3. Проверка, является ли число отрицательным
        System.out.println("\n3. Число отрицательное?");
        System.out.println(IsNegative.isNegative(-10)); // true
        System.out.println(IsNegative.isNegative(0));   // false
        System.out.println(IsNegative.isNegative(5));   // false

        // 4. Печать строки несколько раз
        System.out.println("\n4. Печать строки:");
        PrintStringMultipleTimes.printStringMultipleTimes("Hello", 3); // Hello Hello Hello

        // 5. Проверка високосного года
        System.out.println("\n5. Високосный год?");
        System.out.println(IsLeapYear.isLeapYear(2020)); // true
        System.out.println(IsLeapYear.isLeapYear(1900)); // false
        System.out.println(IsLeapYear.isLeapYear(2000)); // true

        // 6. Инверсия массива
        System.out.println("\n6. Инверсия массива:");
        int[] array = {1, 0, 1, 1, 0};
        InvertArray.invertArray(array);
        System.out.println(Arrays.toString(array)); // [0, 1, 0, 0, 1]

        // 7. Создание последовательного массива
        System.out.println("\n7. Последовательный массив:");
        int[] sequentialArray = CreateSequentialArray.createSequentialArray(10);
        System.out.println(Arrays.toString(sequentialArray)); // [1, 2, 3, ..., 10]

        // 8. Умножение чисел массива на 2, если < 6
        System.out.println("\n8. Модификация массива:");
        int[] numbers = {1, 5, 3, 7, 2};
        ModifyArray.modifyArray(numbers);
        System.out.println(Arrays.toString(numbers)); // [2, 10, 6, 7, 4]

        // 9. Создание диагональной матрицы
        System.out.println("\n9. Диагональная матрица:");
        int[][] matrix = CreateDiagonalMatrix.createDiagonalMatrix(5);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        /*
        [1, 0, 0, 0, 0]
        [0, 1, 0, 0, 0]
        [0, 0, 1, 0, 0]
        [0, 0, 0, 1, 0]
        [0, 0, 0, 0, 1]
        */

        // 10. Создание массива с заданным значением
        System.out.println("\n10. Массив с одинаковыми значениями:");
        int[] customArray = CreateArrayWithInitialValue.createArrayWithInitialValue(5, 7);
        System.out.println(Arrays.toString(customArray)); // [7, 7, 7, 7, 7]

        // 11. Сдвиг массива
        System.out.println("\n11. Сдвиг массива:");
        int[] shiftArray = {1, 2, 3, 4, 5};
        ShiftArray.shiftArray(shiftArray, 0);
        System.out.println(Arrays.toString(shiftArray)); // [4, 5, 1, 2, 3]

        ShiftArray.shiftArray(shiftArray, 9);
        System.out.println(Arrays.toString(shiftArray)); // [1, 2, 3, 4, 5]
    }
}
