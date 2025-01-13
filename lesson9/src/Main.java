public class Main {
    public static void main(String[] args) {
        // Тесты для задания 1-4
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        dogBobik.run(400);
        dogBobik.swim(5);
        catMurzik.run(150);
        catMurzik.swim(10);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        // Тесты для задания 5
        Plate plate = new Plate(25);
        Cat[] cats = {new Cat("Барсик"), new Cat("Васька"), new Cat("Рыжик")};

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сытость: " + cat.isSatiety());
        }
        plate.addFood(20);
        Cat ryzhik = cats[2];
        ryzhik.eat(plate);
        System.out.println(ryzhik.getName() + " сытость после еды: " + ryzhik.isSatiety());

        // Тесты для Payment
        Payment payment = new Payment();
        payment.addItem("Молоко", 2.5);
        payment.addItem("Хлеб", 1.2);
        payment.printReceipt();

        // Тесты для Park
        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00-22:00", 5.0);
        park.addAttraction("Американские горки", "11:00-23:00", 10.0);
        park.showAttractions();
    }
}