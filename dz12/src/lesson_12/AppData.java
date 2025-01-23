package lesson_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    // Метод для сохранения данных в CSV файл
    public void save(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join(";", header));
            writer.newLine();

            for (int[] row : data) {
                StringBuilder rowLine = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    rowLine.append(row[i]);
                    if (i < row.length - 1) {
                        rowLine.append(";");
                    }
                }
                writer.write(rowLine.toString());
                writer.newLine();
            }
        }
    }

    // Метод для загрузки данных из CSV файла
    public static AppData load(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String headerLine = reader.readLine();
            if (headerLine == null) {
                throw new IOException("Файл пуст или не содержит данных.");
            }
            String[] header = headerLine.split(";");

            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] intValues = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    intValues[i] = Integer.parseInt(values[i]);
                }
                dataList.add(intValues);
            }

            int[][] data = dataList.toArray(new int[0][]);
            return new AppData(header, data);
        }
    }
}
