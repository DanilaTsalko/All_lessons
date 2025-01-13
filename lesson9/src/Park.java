import java.util.ArrayList;

class Park {
    private ArrayList<Attraction> attractions = new ArrayList<>();

    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    public void showAttractions() {
        System.out.println("Аттракционы парка:");
        for (Attraction attraction : attractions) {
            System.out.println(attraction.name + " - Время работы: " + attraction.workingHours + ", Цена: " + attraction.price + " руб.");
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }
}