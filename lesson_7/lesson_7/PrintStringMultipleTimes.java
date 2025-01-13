package lesson_7;

public class PrintStringMultipleTimes {
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }
}