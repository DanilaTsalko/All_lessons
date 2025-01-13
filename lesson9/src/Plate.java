class Plate {
    private int food;

    public Plate(int food) {
        if (food > 0) this.food = food;
        else this.food = 0;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды в тарелку.");
        }
    }
}