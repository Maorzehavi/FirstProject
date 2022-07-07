package animal;

import java.util.Random;

public abstract class SeaAnimals {
    private String type;
    private int age;
    protected int maxCapacity;
    protected int currentCapacity;
    Random random = new Random();

    public SeaAnimals() {
        }

    public SeaAnimals(String name) {
        this.type = name;
    }

    public SeaAnimals(String name, int age) {
        this.type = name;
        this.age = age;
    }

    public abstract void swim();
    public abstract void flee();
    protected abstract void eat();

    public int getMaxCapacity() {
        return maxCapacity;
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public boolean alive() {
        return currentCapacity > 0;
    }
    public boolean checkCapacity(int maxCapacity, int currentCapacity) {
        return currentCapacity < maxCapacity;
    }
    public boolean checkActionRandom() {
        return random.nextBoolean();
    }
    public void hunt() {
        System.out.println("the " + this.type + " is hunting");
        if (checkActionRandom()) {
            System.out.println("successes!");
            eat();
        } else {
            System.out.println("maybe next time");
        }
    }
    public void flee(int x) {
        System.out.println("the " + this.type + " is fleeing");
        currentCapacity -= x;
    }
}
