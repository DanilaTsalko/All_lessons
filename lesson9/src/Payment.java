import java.util.ArrayList;

class Payment {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void printReceipt() {
        double total = 0;
        System.out.println("Чек:");
        for (Item item : items) {
            System.out.println(item.name + " - " + item.price + " руб.");
            total += item.price;
        }
        System.out.println("Итого: " + total + " руб.");
    }

    private class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}