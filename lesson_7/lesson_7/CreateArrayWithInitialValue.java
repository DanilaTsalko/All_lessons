package lesson_7;

public class CreateArrayWithInitialValue {
    public static int[] createArrayWithInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
