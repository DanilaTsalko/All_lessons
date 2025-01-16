import java.util.ArrayList;
import java.util.List;

// Базовый класс Fruit
abstract class Fruit {
    public abstract float getWeight();
}

// Подкласс Apple
class Apple extends Fruit {
    @Override
    public float getWeight() {
        return 1.0f;
    }
}

// Подкласс Orange
class Orange extends Fruit {
    @Override
    public float getWeight() {
        return 1.5f;
    }
}

// Класс Box
class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    // Метод добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Метод для получения веса коробки
    public float getWeight() {
        if (fruits.isEmpty()) return 0;
        return fruits.size() * fruits.get(0).getWeight();
    }

    // Метод сравнения коробок по весу
    public boolean compare(Box<?> otherBox) {
        return Float.compare(this.getWeight(), otherBox.getWeight()) == 0;
    }

    // Метод пересыпания фруктов из текущей коробки в другую
    public void transferTo(Box<T> otherBox) {
        if (this == otherBox) {
            throw new IllegalArgumentException("Нельзя пересыпать фрукты в ту же самую коробку");
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    // Получение количества фруктов (опционально для удобства)
    public int getFruitCount() {
        return fruits.size();
    }
}

// Метод для обмена элементов массива
class ArrayUtils {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Индексы находятся вне границ массива");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        ArrayUtils.swap(numbers, 1, 3);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Работа с коробками
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Коробки равны по весу? " + appleBox.compare(orangeBox));

        // Пересыпаем фрукты
        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferTo(anotherAppleBox);

        System.out.println("Количество яблок в первой коробке: " + appleBox.getFruitCount()); // Ожидаемый вывод: 0
        System.out.println("Количество яблок во второй коробке: " + anotherAppleBox.getFruitCount()); // Ожидаемый вывод: 2
    }
}
