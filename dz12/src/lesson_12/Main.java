package lesson_12;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);
        String fileName = "data.csv";

        try {
            // Сохранение данных в файл
            appData.save(fileName);
            System.out.println("Данные успешно сохранены в файл: " + fileName);

            // Загрузка данных из файла
            AppData loadedData = AppData.load(fileName);
            System.out.println("Заголовок: " + String.join(", ", loadedData.getHeader()));
            System.out.println("Данные:");
            for (int[] row : loadedData.getData()) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
