package lesson_7;

public class CreateSequentialArray {
    public static int[] createSequentialArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}