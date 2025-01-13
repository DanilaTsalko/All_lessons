class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        catCount++;
        this.satiety = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= 10) { // Считаем, что кот ест порцию в 10
            plate.decreaseFood(10);
            satiety = true;
            System.out.println(getName() + " покушал и теперь сыт.");
        } else {
            System.out.println(getName() + " не хватает еды в тарелке.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}