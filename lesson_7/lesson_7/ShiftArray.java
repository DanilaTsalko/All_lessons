package lesson_7;

public class ShiftArray {
    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        n = (n % length + length) % length;
        for (int i = 0; i < n; i++) {
            int last = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }
}